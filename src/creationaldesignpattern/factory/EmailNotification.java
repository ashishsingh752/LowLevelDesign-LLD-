package creationaldesignpattern.factory;

//Step 2: Concrete Product Classes
public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending EMAIL notification: " + message);
        // Here you could add actual email sending logic (e.g., JavaMail)
    }
}
