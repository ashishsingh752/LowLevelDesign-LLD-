package creationaldesignpattern.abstractfactory;

//6. Client Code (Restaurant / Demo)
// BurgerFactoryDemo.java
public class BurgerFactoryDemo {

    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Pattern - Burger Example ===\n");

        // Order from KingBurger (Western style)
        BurgerFactory kingFactory = new KingBurgerFactory();
        System.out.println("--- Ordering from KingBurger ---");
        orderAndServe(kingFactory);

        // Order from SinghBurger (Indian style)
        BurgerFactory singhFactory = new SinghBurgerFactory();
        System.out.println("--- Ordering from SinghBurger ---");
        orderAndServe(singhFactory);
    }

    // Helper method - Client works only with abstract factory
    private static void orderAndServe(BurgerFactory factory) {
        Burger basic = factory.createBasicBurger();
        Burger moderate = factory.createModerateBurger();
        Burger premium = factory.createPremiumBurger();

        basic.prepare();
        basic.serve();
        System.out.println("→ " + basic.getDescription() + "\n");

        moderate.prepare();
        moderate.serve();
        System.out.println("→ " + moderate.getDescription() + "\n");

        premium.prepare();
        premium.serve();
        System.out.println("→ " + premium.getDescription() + "\n");
    }
}