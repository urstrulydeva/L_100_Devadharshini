package Design_patterns.Structural_Pattern.Facade_Pattern;

public class Receipt {
    public final String orderId;
    public final boolean success;
    public final String message;
    public final String shipmentId;

    public Receipt(String orderId, boolean success, String message, String shipmentId) {
        this.orderId = orderId;
        this.success = success;
        this.message = message;
        this.shipmentId = shipmentId;
    }

    @Override
    public String toString() {
        return String.format(
            "Receipt{orderId=%s, success=%s, message='%s', shipmentId=%s}",
            orderId, success, message, shipmentId
        );
    }
}

