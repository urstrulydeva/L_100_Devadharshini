package Design_patterns.Behavourial_Pattern.Chain_Of_Responsibility_Pattern;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level) { this.level = level; }

    protected void write(String message) {
        System.out.println("Error: " + message);
    }
}
