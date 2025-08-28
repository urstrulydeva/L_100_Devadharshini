package Design_patterns.Behavourial_Pattern.Chain_Of_Responsibility_Pattern;

public class FileLogger extends Logger {
    public FileLogger(int level) { this.level = level; }

    protected void write(String message) {
        System.out.println("File: " + message);
    }
}