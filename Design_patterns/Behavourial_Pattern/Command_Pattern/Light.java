package Design_patterns.Behavourial_Pattern.Command_Pattern;


public class Light {
    private boolean on = false;

    public void turnOn() {
        on = true;
        System.out.println("Light is ON");
    }

    public void turnOff() {
        on = false;
        System.out.println("Light is OFF");
    }

    public boolean isOn() {
        return on;
    }
}

