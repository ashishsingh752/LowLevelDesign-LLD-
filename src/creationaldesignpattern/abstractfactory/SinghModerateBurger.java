package creationaldesignpattern.abstractfactory;

// SinghModerateBurger.java
public class SinghModerateBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Singh Moderate Burger: Paneer patty + cheese + Wheat bun + mint chutney + spices");
    }

    @Override
    public void serve() {
        System.out.println("Serving Singh Moderate Burger");
    }

    @Override
    public String getDescription() {
        return "Singh Moderate Burger (Paneer + Indian spices)";
    }
}
