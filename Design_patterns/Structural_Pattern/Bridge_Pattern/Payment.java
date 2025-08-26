package Design_patterns.Structural_Pattern.Facade_Pattern;

public abstract class Payment {
    protected final PaymentGateway gateway;
    protected final String merchantId;

    protected Payment(PaymentGateway gateway, String merchantId) {
        this.gateway = gateway;
        this.merchantId = merchantId;
    }

    public abstract void process(double amount, String currency);
}

