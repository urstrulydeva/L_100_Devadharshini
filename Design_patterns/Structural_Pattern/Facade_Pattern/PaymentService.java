package Design_patterns.Structural_Pattern.Facade_Pattern;

public class PaymentService {
    public boolean charge(String userId, double amount) {
        System.out.println(String.format("[Payment] Charged %s ₹%.2f", userId, amount));
        return true;
    }
    public void refund(String userId, double amount) {
        System.out.println(String.format("[Payment] Refunded %s ₹%.2f", userId, amount));
    }
}

