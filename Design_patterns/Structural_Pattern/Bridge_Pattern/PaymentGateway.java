package Design_patterns.Structural_Pattern.Facade_Pattern;

public interface PaymentGateway {
    void pay(String merchantId, double amount, String currency);
}

