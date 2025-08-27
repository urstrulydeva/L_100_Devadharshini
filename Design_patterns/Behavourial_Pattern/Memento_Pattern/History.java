package Design_patterns.Behavourial_Pattern.Memento_Pattern;
import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private final Deque<Editor.Snapshot> stack = new ArrayDeque<>();
    public void push(Editor.Snapshot s) { stack.push(s); }
    public Editor.Snapshot pop() { return stack.pop(); }
    public boolean isEmpty() { return stack.isEmpty(); }
}
