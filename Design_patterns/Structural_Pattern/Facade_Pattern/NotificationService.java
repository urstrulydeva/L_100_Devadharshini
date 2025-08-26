package Design_patterns.Structural_Pattern.Facade_Pattern;

public class NotificationService {
    public void notify(String userId, String message) {
        System.out.println("[Notify] -> " + userId + ": " + message);
    }
}
