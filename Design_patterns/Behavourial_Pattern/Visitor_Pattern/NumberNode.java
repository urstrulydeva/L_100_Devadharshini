package Design_patterns.Behavourial_Pattern.Visitor_Pattern;


public class NumberNode implements Node {
    public final int value;
    public NumberNode(int v){ this.value = v; }
    public <R> R accept(Visitor<R> v){ return v.visitNumber(this); }
}

