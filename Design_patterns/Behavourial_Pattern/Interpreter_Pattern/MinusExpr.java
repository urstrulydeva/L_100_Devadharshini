package Design_patterns.Behavourial_Pattern.Interpreter_Pattern;

public class MinusExpr implements Expression {
    private final Expression left, right;
    MinusExpr(Expression left, Expression right) {
        this.left = left; this.right = right;
    }
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
