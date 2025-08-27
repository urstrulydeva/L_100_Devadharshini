package Design_patterns.Behavourial_Pattern.Command_Pattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class Remote {
    private final Deque<Command> history = new ArrayDeque<>();

    public void press(Command c) {
        System.out.println("[Remote] Executing: " + c.name());
        c.execute();
        history.push(c);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            System.out.println("[Remote] Undo: " + last.name());
            last.undo();
        } else {
            System.out.println("[Remote] Nothing to undo.");
        }
    }
}
