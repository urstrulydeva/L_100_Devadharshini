package Design_patterns.Behavourial_Pattern.Iterator_Pattern;


public class Order {
    public final String id;
    public final String customer;
    public final int amount;

    public Order(String id, String customer, int amount) {
        this.id = id; this.customer = customer; this.amount = amount;
    }

    @Override public String toString() {
        return "Order{id='" + id + "', customer='" + customer + "', amount=" + amount + "}";
    }
}

