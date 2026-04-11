package creationaldesignpattern.factory;

// Step 4: Client Code (Main class)
public class FactoryPatternDemo {
    public static void main(String[] args) {

        // Client doesn't know about concrete classes
        Notification emailNotif = NotificationFactory.createNotification("EMAIL");
        emailNotif.notifyUser("Hello via Email!");

        Notification smsNotif = NotificationFactory.createNotification("SMS");
        smsNotif.notifyUser("Hello via SMS!");

        Notification pushNotif = NotificationFactory.createNotification("PUSH");
        pushNotif.notifyUser("Hello via Push!");
    }
}
