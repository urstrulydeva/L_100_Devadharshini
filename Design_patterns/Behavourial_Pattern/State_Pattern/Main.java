package Design_patterns.Behavourial_Pattern.State_Pattern;


public class Main {
    public static void main(String[] args) {
        Order o = new Order("ORD-101");
        o.pay();
        o.ship();
        o.deliver();

        System.out.println("--- Try an invalid transition:");
        try {
            o.cancel();
        } catch (Exception ex) {
            System.out.println("Expected: " + ex.getMessage());
        }

        System.out.println("--- New order cancelled before payment:");
        Order o2 = new Order("ORD-102");
        o2.cancel();
        System.out.println("Final state: " + o2.state());
    }
}
