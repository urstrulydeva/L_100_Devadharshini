package Design_patterns.Behavourial_Pattern.Observer_Pattern;

public class ClassRoom implements Observer {
    private final String name;

    public ClassRoom(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " reacts to bell: " + event);
    }
}