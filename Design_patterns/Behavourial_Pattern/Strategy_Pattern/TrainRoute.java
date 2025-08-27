package Design_patterns.Behavourial_Pattern.Strategy_Pattern;

public class TrainRoute implements RouteStrategy {
    @Override
    public int etaMinutes(String from, String to) {
        // pretend to compute via scheduled trains
        return 25;
    }

    @Override
    public String name() {
        return "Train";
    }
}
