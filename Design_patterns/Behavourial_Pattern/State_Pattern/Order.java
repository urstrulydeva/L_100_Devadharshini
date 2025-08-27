package Design_patterns.Behavourial_Pattern.State_Pattern;

public class Order {
    private final String id;
    private State state;

    public Order(String id) {
        this.id = id;
        this.state = new NewState(); // default
        System.out.println("Order " + id + " in state: " + state.name());
    }

    void setState(State s) {
        System.out.println("Order " + id + " -> " + state.name() + " → " + s.name());
        this.state = s;
    }

    public String id() { return id; }
    public String state() { return state.name(); }

    // API exposed to callers
    public void pay()     { state.pay(this); }
    public void ship()    { state.ship(this); }
    public void deliver() { state.deliver(this); }
    public void cancel()  { state.cancel(this); }

    // Convenience for illegal op
    static void illegal(State s, String op) {
        throw new IllegalStateException("Cannot " + op + " when state is " + s.name());
    }
}

