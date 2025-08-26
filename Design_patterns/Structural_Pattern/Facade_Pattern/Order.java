package Design_patterns.Structural_Pattern.Facade_Pattern;

import java.util.UUID;

public class Order {
    public final String orderId = UUID.randomUUID().toString();
    public final String userId;
    public final String sku;
    public final int quantity;
    public final double amount;
    public final String address;

    public Order(String userId, String sku, int quantity, double amount, String address) {
        this.userId = userId;
        this.sku = sku;
        this.quantity = quantity;
        this.amount = amount;
        this.address = address;
    }
}

