package Design_patterns.Behavourial_Pattern.Mediator_Pattern;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User dev = new ConcreteUser(mediator, "Dev");
        User ved = new ConcreteUser(mediator, "Ved");

        mediator.addUser(dev);
        mediator.addUser(ved);

        dev.send("Hey Ved!");
        ved.send("Hey Dev!");
    }
}

