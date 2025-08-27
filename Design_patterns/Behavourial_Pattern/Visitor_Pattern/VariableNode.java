package Design_patterns.Behavourial_Pattern.Visitor_Pattern;


public class VariableNode implements Node {
    public final String name;
    public VariableNode(String n){ this.name = n; }
    public <R> R accept(Visitor<R> v){ return v.visitVariable(this); }
}

