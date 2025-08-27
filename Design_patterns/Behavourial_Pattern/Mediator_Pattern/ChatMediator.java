package Design_patterns.Behavourial_Pattern.Mediator_Pattern;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
