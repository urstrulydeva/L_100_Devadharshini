package Design_patterns.Behavourial_Pattern.Mediator_Pattern;

class ChatRoom implements ChatMediator {
    private java.util.List<User> users = new java.util.ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String msg, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(msg);
            }
        }
    }
}
