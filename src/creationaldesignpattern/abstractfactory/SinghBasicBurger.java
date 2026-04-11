package creationaldesignpattern.abstractfactory;

// 3. Concrete Products – SinghBurger Family (Indian style)
// SinghBasicBurger.java
public class SinghBasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Singh Basic Burger: Aloo tikki + Wheat bun + chutney + onion");
    }

    @Override
    public void serve() {
        System.out.println("Serving Singh Basic Burger");
    }

    @Override
    public String getDescription() {
        return "Singh Basic Burger (Indian spiced aloo tikki)";
    }
}
