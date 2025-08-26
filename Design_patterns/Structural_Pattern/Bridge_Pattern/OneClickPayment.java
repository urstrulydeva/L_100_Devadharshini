package Design_patterns.Structural_Pattern.Facade_Pattern;

public class OneClickPayment extends Payment {
    public OneClickPayment(PaymentGateway gateway, String merchantId) {
        super(gateway, merchantId);
    }

    @Override
    public void process(double amount, String currency) {
        System.out.println("[OneClick] token validated ✅");
        gateway.pay(merchantId, amount, currency);
    }
}
