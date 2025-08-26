package Design_patterns.Structural_Pattern.Flyweight_Pattern;
public class Main {
    private static final String[] colors = { "Red", "Green", "Blue", "Yellow", "Black" };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String color = getRandomColor();
            Circle circle = CircleFactory.getCircle(color);
            circle.draw(getRandomX(), getRandomY(), 100);
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
