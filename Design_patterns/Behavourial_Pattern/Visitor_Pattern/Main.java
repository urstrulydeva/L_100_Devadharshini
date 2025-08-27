package Design_patterns.Behavourial_Pattern.Visitor_Pattern;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // (x + 2) * (3 + y)
        Node expr = new MulNode(
            new AddNode(new VariableNode("x"), new NumberNode(2)),
            new AddNode(new NumberNode(3), new VariableNode("y"))
        );

        PrintVisitor printer = new PrintVisitor();
        String pretty = expr.accept(printer);
        System.out.println("Expr: " + pretty);

        EvalVisitor eval1 = new EvalVisitor(Map.of("x", 4, "y", 1));
        System.out.println("Eval x=4,y=1: " + expr.accept(eval1));

        EvalVisitor eval2 = new EvalVisitor(Map.of("x", 10, "y", -3));
        System.out.println("Eval x=10,y=-3: " + expr.accept(eval2));
    }
}
