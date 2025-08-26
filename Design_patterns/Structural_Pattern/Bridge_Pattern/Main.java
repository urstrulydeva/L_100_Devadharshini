package Design_patterns.Structural_Pattern.Facade_Pattern;

public class Main {
    public static void main(String[] args) {
        // Abstractions (business flows) × Implementations (vendors)
        Payment p1 = new OneClickPayment(new RazorpayGateway(), "MERCH-IN-001");
        p1.process(999.00, "INR");

        Payment p2 = new SubscriptionPayment(new GpayGateway(), "MERCH-US-042");
        p2.process(19.99, "USD");

        // Hot-swap vendor without touching business logic:
        Payment p3 = new OneClickPayment(new GpayGateway(), "MERCH-EU-777");
        p3.process(14.99, "EUR");
    }
}

