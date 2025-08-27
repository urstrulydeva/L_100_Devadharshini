package Design_patterns.Behavourial_Pattern.Chain_Of_Responsibility_Pattern;

public class Main {
    private static Logger getChain() {
        Logger error = new ErrorLogger(Logger.ERROR);
        Logger file = new FileLogger(Logger.DEBUG);
        Logger console = new ConsoleLogger(Logger.INFO);

        error.setNext(file);
        file.setNext(console);

        return error;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChain();

        loggerChain.logMessage(Logger.INFO, "This is an info.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug.");
        loggerChain.logMessage(Logger.ERROR, "This is an error.");
    }
}
