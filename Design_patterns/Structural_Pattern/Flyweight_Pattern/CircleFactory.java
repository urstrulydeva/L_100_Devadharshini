package Design_patterns.Structural_Pattern.Flyweight_Pattern;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating new Circle of color: " + color);
        }
        return circle;
    }
}
