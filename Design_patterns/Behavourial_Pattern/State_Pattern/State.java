package Design_patterns.Behavourial_Pattern.State_Pattern;


public interface State {
    void pay(Order ctx);
    void ship(Order ctx);
    void deliver(Order ctx);
    void cancel(Order ctx);
    String name();
}

