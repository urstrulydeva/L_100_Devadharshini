package Design_patterns.Behavourial_Pattern.Strategy_Pattern;

public interface RouteStrategy {
    int etaMinutes(String from, String to);
    String name();
}
