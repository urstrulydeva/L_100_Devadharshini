package Design_patterns.Behavourial_Pattern.Memento_Pattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.type("Hello");
        history.push(editor.save());       // save #1

        editor.type(", world!");
        history.push(editor.save());       // save #2

        editor.type(" (oops)");            // mistake
        System.out.println("Now:     " + editor.getContent());

        // Undo last change
        editor.restore(history.pop());
        System.out.println("Undo 1:  " + editor.getContent());

        // Undo again
        editor.restore(history.pop());
        System.out.println("Undo 2:  " + editor.getContent());
    }
}
