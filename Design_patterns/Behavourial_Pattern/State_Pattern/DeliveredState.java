package Design_patterns.Behavourial_Pattern.State_Pattern;


public class DeliveredState implements State {
    public void pay(Order ctx)     { Order.illegal(this, "pay"); }
    public void ship(Order ctx)    { Order.illegal(this, "ship"); }
    public void deliver(Order ctx) { Order.illegal(this, "deliver"); }
    public void cancel(Order ctx)  { Order.illegal(this, "cancel"); }
    public String name() { return "DELIVERED"; }
}

