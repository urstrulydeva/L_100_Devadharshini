package Design_patterns.Behavourial_Pattern.Visitor_Pattern;

public class MulNode implements Node {
    public final Node left, right;
    public MulNode(Node l, Node r){ this.left = l; this.right = r; }
    public <R> R accept(Visitor<R> v){ return v.visitMul(this); }
}

