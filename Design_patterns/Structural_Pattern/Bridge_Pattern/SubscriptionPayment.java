package Design_patterns.Structural_Pattern.Facade_Pattern;

public class SubscriptionPayment extends Payment {
    public SubscriptionPayment(PaymentGateway gateway, String merchantId) {
        super(gateway, merchantId);
    }

    @Override
    public void process(double amount, String currency) {
        System.out.println("[Subscription] invoice created, proration applied");
        gateway.pay(merchantId, amount, currency);
    }
}

