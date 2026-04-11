package creationaldesignpattern.singleton;

public class Singleton {

    // Static instance created at class loading time
    private static final Singleton INSTANCE = new Singleton();

    // Private constructor - prevents instantiation from outside
    private Singleton() {
        // Optional: Prevent reflection attacks
        if (INSTANCE != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance");
        }
    }

    // Public static method to get the instance
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton! Instance hashCode: " + hashCode());
    }
}
