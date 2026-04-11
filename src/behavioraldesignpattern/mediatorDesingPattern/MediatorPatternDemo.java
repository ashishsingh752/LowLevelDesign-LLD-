package behavioraldesignpattern.mediatorDesingPattern;


public class MediatorPatternDemo {
    public static void main(String[] args) {
        // Create Mediator
        ChatMediator chatRoom = new ChatRoom();

        // Create Users (Colleagues)
        User vibhaw = new ChatUser(chatRoom, "vibhaw");
        User Riya = new ChatUser(chatRoom, "Riya");
        User Abhay = new ChatUser(chatRoom, "Abhay");
        User Nidhi = new ChatUser(chatRoom, "Nidhi");

        // Add users to chat room
        chatRoom.addUser(vibhaw);
        chatRoom.addUser(Riya);
        chatRoom.addUser(Abhay);
        chatRoom.addUser(Nidhi);

        System.out.println("\n=== Chat Session Starts ===\n");

        // Users communicate only through mediator
        vibhaw.send("Hey everyone, how are you all doing today?");

        System.out.println("-------------------");

        Riya.send("I'm doing great! Just finished learning Strategy pattern.");

        System.out.println("-------------------");

        Abhay.send("Same here. Mediator pattern looks interesting too!");

        System.out.println("-------------------");

        Nidhi.send("Yes, it's helping me understand loose coupling better.");
    }
}
