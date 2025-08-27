package Design_patterns.Behavourial_Pattern.Strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        Navigator nav = new Navigator(new CarRoute());

        nav.estimateAndPrint("Home", "Office");
        nav.setStrategy(new TrainRoute());
        nav.estimateAndPrint("Home", "Office");
        nav.setStrategy(new FlightRoute());
        nav.estimateAndPrint("City A", "City B");
    }
}
