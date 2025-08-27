package Design_patterns.Behavourial_Pattern.Interpreter_Pattern;

class SimpleParser {
    // Parses inputs like: "5 + 3 - 2 + 10"
    // Left-to-right evaluation (no precedence handling beyond + and -).
    public Expression parse(String input) {
        String[] tokens = input.trim().split("\\s+");
        if (tokens.length == 0) throw new IllegalArgumentException("Empty input");

        Expression result = new NumberExpr(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);
            Expression right = new NumberExpr(number);

            if (op.equals("+")) {
                result = new PlusExpr(result, right);
            } else if (op.equals("-")) {
                result = new MinusExpr(result, right);
            } else {
                throw new IllegalArgumentException("Unknown operator: " + op);
            }
        }
        return result;
    }
}
