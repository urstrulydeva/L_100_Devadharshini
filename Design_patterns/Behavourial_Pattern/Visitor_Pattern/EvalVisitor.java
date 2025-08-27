package Design_patterns.Behavourial_Pattern.Visitor_Pattern;


import java.util.Map;

public class EvalVisitor implements Visitor<Integer> {
    private final Map<String,Integer> env;
    public EvalVisitor(Map<String,Integer> env){ this.env = env; }

    public Integer visitNumber(NumberNode n){ return n.value; }
    public Integer visitVariable(VariableNode v){ return env.getOrDefault(v.name, 0); }
    public Integer visitAdd(AddNode a){ return a.left.accept(this) + a.right.accept(this); }
    public Integer visitMul(MulNode m){ return a(m.left) * a(m.right); }

    private int a(Node n){ return n.accept(this); }
}

