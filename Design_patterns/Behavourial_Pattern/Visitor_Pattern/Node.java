package Design_patterns.Behavourial_Pattern.Visitor_Pattern;

public interface Node {
    <R> R accept(Visitor<R> v);
}
