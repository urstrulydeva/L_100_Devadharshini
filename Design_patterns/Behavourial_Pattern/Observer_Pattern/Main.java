package Design_patterns.Behavourial_Pattern.Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        Subject schoolBell = new Subject();

        ClassRoom classA = new ClassRoom("Class A");
        ClassRoom classB = new ClassRoom("Class B");
        ClassRoom classC = new ClassRoom("Class C");

        schoolBell.subscribe(classA);
        schoolBell.subscribe(classB);
        schoolBell.subscribe(classC);

        schoolBell.publish("⏰ Period over!");
        System.out.println("---");

        schoolBell.unsubscribe(classB);
        schoolBell.publish("🍽️ Lunch time!");
    }
}
