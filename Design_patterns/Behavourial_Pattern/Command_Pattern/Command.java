package Design_patterns.Behavourial_Pattern.Command_Pattern;


public interface Command {
    void execute();
    void undo();
    String name();
}

