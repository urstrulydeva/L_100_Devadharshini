package Design_patterns.Behavourial_Pattern.Command_Pattern;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Remote remote = new Remote();

        Command on = new TurnOnCommand(light);
        Command off = new TurnOffCommand(light);

        remote.press(on);   // Light ON
        remote.press(off);  // Light OFF
        remote.undo();      // Undo OFF -> ON
        remote.undo();      // Undo ON -> OFF
        remote.undo();      // Nothing to undo
    }
}