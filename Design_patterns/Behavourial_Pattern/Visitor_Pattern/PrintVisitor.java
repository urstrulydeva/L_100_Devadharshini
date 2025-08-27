package Design_patterns.Behavourial_Pattern.Visitor_Pattern;


public class PrintVisitor implements Visitor<String> {
    public String visitNumber(NumberNode n){ return String.valueOf(n.value); }
    public String visitVariable(VariableNode v){ return v.name; }
    public String visitAdd(AddNode a){ return "(" + a.left.accept(this) + " + " + a.right.accept(this) + ")"; }
    public String visitMul(MulNode m){ return "(" + m.left.accept(this) + " * " + m.right.accept(this) + ")"; }
}

