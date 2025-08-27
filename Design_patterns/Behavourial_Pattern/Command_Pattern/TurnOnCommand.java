package Design_patterns.Behavourial_Pattern.Command_Pattern;

public class TurnOnCommand implements Command {
    private final Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }

    @Override
    public String name() {
        return "TurnOn";
    }
}
