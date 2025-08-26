package Design_patterns.Structural_Pattern.Facade_Pattern;

public class CheckoutFacade {
    private final InventoryService inventory;
    private final PaymentService payment;
    private final ShippingService shipping;
    private final NotificationService notifications;

    public CheckoutFacade(InventoryService i, PaymentService p, ShippingService s, NotificationService n) {
        this.inventory = i;
        this.payment = p;
        this.shipping = s;
        this.notifications = n;
    }

    // All the messy orchestration + compensations in one place.
    public Receipt placeOrder(Order order) {
        boolean inventoryOk = false;
        boolean paymentOk = false;
        String shipmentId = null;

        try {
            inventoryOk = inventory.reserve(order.sku, order.quantity);
            if (!inventoryOk) return fail(order, "Out of stock");

            paymentOk = payment.charge(order.userId, order.amount);
            if (!paymentOk) return fail(order, "Payment failed");

            shipmentId = shipping.createShipment(order.orderId, order.address);

            Receipt receipt = new Receipt(order.orderId, true, "Order placed", shipmentId);
            notifications.notify(order.userId, "Your order " + order.orderId + " is confirmed 🚚");
            return receipt;
        } catch (Exception e) {
            return compensate(order, inventoryOk, paymentOk, shipmentId, e);
        }
    }

    private Receipt compensate(Order order, boolean inventoryOk, boolean paymentOk, String shipmentId, Exception e) {
        if (shipmentId != null) shipping.cancel(shipmentId);
        if (paymentOk) payment.refund(order.userId, order.amount);
        if (inventoryOk) inventory.release(order.sku, order.quantity);
        notifications.notify(order.userId, "Order " + order.orderId + " failed: " + e.getMessage());
        return new Receipt(order.orderId, false, "Failed: " + e.getMessage(), null);
    }

    private Receipt fail(Order order, String reason) {
        notifications.notify(order.userId, "Order " + order.orderId + " failed: " + reason);
        return new Receipt(order.orderId, false, reason, null);
    }
}

