package Design_patterns.Behavourial_Pattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) { observers.add(o); }
    public void unsubscribe(Observer o) { observers.remove(o); }

    public void publish(String event) {
        System.out.println("[Bell] " + event);
        notifyObservers(event);
    }

    private void notifyObservers(String event) {
        for (Observer o : observers) {
            o.update(event);
        }
    }
}
