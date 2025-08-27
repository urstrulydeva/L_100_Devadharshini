package Design_patterns.Behavourial_Pattern.Strategy_Pattern;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy initial) {
        this.strategy = initial;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void estimateAndPrint(String from, String to) {
        int eta = strategy.etaMinutes(from, to);
        System.out.println("Using " + strategy.name() + " from " + from + " to " + to +
                " → ETA: " + eta + " minutes");
    }
}
