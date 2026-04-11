package creationaldesignpattern.factory;

//Step 3: The Factory Class
public class NotificationFactory {

    // Static factory method - returns the appropriate object
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
