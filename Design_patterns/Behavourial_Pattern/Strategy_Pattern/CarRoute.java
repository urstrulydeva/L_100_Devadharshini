package Design_patterns.Behavourial_Pattern.Strategy_Pattern;

public class CarRoute implements RouteStrategy {
    @Override
    public int etaMinutes(String from, String to) {
        // pretend to compute via road network
        return 40;
    }

    @Override
    public String name() {
        return "Car";
    }
}
