package creationaldesignpattern.abstractfactory;

// SinghPremiumBurger.java
public class SinghPremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Singh Premium Burger: Chicken tikka + extra cheese + green chutney + crispy onions + special masala");
    }

    @Override
    public void serve() {
        System.out.println("Serving Singh Premium Burger");
    }

    @Override
    public String getDescription() {
        return "Singh Premium Burger (Tikka Chicken Deluxe)";
    }
}
