package Design_patterns.Behavourial_Pattern.State_Pattern;


public class NewState implements State {
    public void pay(Order ctx)     { ctx.setState(new PaidState()); }
    public void ship(Order ctx)    { Order.illegal(this, "ship"); }
    public void deliver(Order ctx) { Order.illegal(this, "deliver"); }
    public void cancel(Order ctx)  { ctx.setState(new CancelledState()); }
    public String name() { return "NEW"; }
}

