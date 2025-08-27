package Design_patterns.Behavourial_Pattern.Strategy_Pattern;

public class FlightRoute implements RouteStrategy {
    @Override
    public int etaMinutes(String from, String to) {
        // pretend to compute via flights + airport overhead
        return 90;
    }

    @Override
    public String name() {
        return "Flight";
    }
}