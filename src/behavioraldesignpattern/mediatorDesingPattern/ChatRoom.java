package behavioraldesignpattern.mediatorDesingPattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.name + " joined the chat room.");
    }

    @Override
    public void sendMessage(String message, User sender) {
        System.out.println("\n[" + sender.name + "] sends: " + message);

        // Broadcast to all users except the sender
        for (User user : users) {
            if (user != sender) {   // Don't send back to sender
                user.receive(message);
            }
        }
    }
}
