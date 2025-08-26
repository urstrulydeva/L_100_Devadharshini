package Design_patterns.Structural_Pattern.Facade_Pattern;

public class Main {
    public static void main(String[] args) {
        CheckoutFacade facade = new CheckoutFacade(
            new InventoryService(),
            new PaymentService(),
            new ShippingService(),
            new NotificationService()
        );

        Order order = new Order("user-123", "SKU-AYIRAI-FISH-XL", 2, 1499.00, "Bengaluru, KA");
        Receipt receipt = facade.placeOrder(order);
        System.out.println(receipt);
    }
}

