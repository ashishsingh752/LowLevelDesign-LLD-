package behavioraldesignpattern.mediatorDesingPattern;

// Mediator Interface
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
