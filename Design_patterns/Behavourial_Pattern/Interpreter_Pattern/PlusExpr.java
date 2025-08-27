package Design_patterns.Behavourial_Pattern.Interpreter_Pattern;

public class PlusExpr implements Expression {
    private final Expression left, right;
    PlusExpr(Expression left, Expression right) {
        this.left = left; this.right = right;
    }
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
