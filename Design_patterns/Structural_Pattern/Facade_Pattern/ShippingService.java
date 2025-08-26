package Design_patterns.Structural_Pattern.Facade_Pattern;

public class ShippingService {
    public String createShipment(String orderId, String address) {
        System.out.println("[Shipping] Creating shipment to " + address);
        return "SHIP-" + orderId.substring(0, 8);
    }
    public void cancel(String shipmentId) {
        System.out.println("[Shipping] Canceled " + shipmentId);
    }
}

