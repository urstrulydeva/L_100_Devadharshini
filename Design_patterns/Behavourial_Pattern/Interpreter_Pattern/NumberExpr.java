package Design_patterns.Behavourial_Pattern.Interpreter_Pattern;

public class NumberExpr implements Expression {
    private final int value;
    NumberExpr(int value) { this.value = value; }
    public int interpret() { return value; }
}
