package Design_patterns.Behavourial_Pattern.Memento_Pattern;

public class Editor {
    private String content = "";

    // change state
    public void type(String newText) {
        content += newText;
    }

    public String getContent() {
        return content;
    }

    // create memento
    public Snapshot save() {
        return new Snapshot(content);
    }

    // restore from memento
    public void restore(Snapshot m) {
        this.content = m.state;
    }

    // the memento object (kept simple)
    static class Snapshot {
        private final String state;
        private Snapshot(String state) { this.state = state; }
    }
}
