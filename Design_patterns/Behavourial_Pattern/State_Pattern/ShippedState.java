package Design_patterns.Behavourial_Pattern.State_Pattern;


public class ShippedState implements State {
    public void pay(Order ctx)     { Order.illegal(this, "pay"); }
    public void ship(Order ctx)    { Order.illegal(this, "ship again"); }
    public void deliver(Order ctx) { ctx.setState(new DeliveredState()); }
    public void cancel(Order ctx)  { Order.illegal(this, "cancel after ship"); }
    public String name() { return "SHIPPED"; }
}

