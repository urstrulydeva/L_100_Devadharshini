package Design_patterns.Behavourial_Pattern.Visitor_Pattern;


public interface Visitor<R> {
    R visitNumber(NumberNode n);
    R visitVariable(VariableNode v);
    R visitAdd(AddNode a);
    R visitMul(MulNode m);
}

