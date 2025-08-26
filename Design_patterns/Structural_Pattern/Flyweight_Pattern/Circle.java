package Design_patterns.Structural_Pattern.Flyweight_Pattern;

public class Circle {
    private final String color;  // Intrinsic (shared)

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y, int radius) {
        System.out.println("Drawing circle [Color: " + color + 
                           ", x: " + x + ", y: " + y + ", radius: " + radius + "]");
    }
}
