package Design_patterns.Behavourial_Pattern.State_Pattern;


public class PaidState implements State {
    public void pay(Order ctx)     { Order.illegal(this, "pay again"); }
    public void ship(Order ctx)    { ctx.setState(new ShippedState()); }
    public void deliver(Order ctx) { Order.illegal(this, "deliver before ship"); }
    public void cancel(Order ctx)  { ctx.setState(new CancelledState()); }
    public String name() { return "PAID"; }
}

