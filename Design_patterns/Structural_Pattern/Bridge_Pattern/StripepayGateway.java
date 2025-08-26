package Design_patterns.Structural_Pattern.Facade_Pattern;

public class StripepayGateway implements PaymentGateway {
    @Override
    public void pay(String merchantId, double amount, String currency) {
        System.out.println("[Gpay] merchant=%s amount=%.2f %s"
                .formatted(merchantId, amount, currency));
    }
}
