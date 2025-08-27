package Design_patterns.Behavourial_Pattern.Chain_Of_Responsibility_Pattern;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(int level) { this.level = level; }

    protected void write(String message) {
        System.out.println("Console: " + message);
    }
}
