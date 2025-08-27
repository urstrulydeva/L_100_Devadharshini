package Design_patterns.Behavourial_Pattern.Interpreter_Pattern;

public class Main {
    public static void main(String[] args) {
        SimpleParser parser = new SimpleParser();

        String expr1 = "5 + 3 - 2 + 10";
        String expr2 = "20 - 7 - 3 + 4";

        int value1 = parser.parse(expr1).interpret();
        int value2 = parser.parse(expr2).interpret();

        System.out.println(expr1 + " = " + value1); // 16
        System.out.println(expr2 + " = " + value2); // 14
    }
}
