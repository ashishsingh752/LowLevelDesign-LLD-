package creationaldesignpattern.abstractfactory;

// KingModerateBurger.java
public class KingModerateBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing King Moderate Burger: Cheese + double patty + Wheat bun + special sauce");
    }

    @Override
    public void serve() {
        System.out.println("Serving King Moderate Burger");
    }

    @Override
    public String getDescription() {
        return "King Moderate Burger (Wheat bun with cheese)";
    }
}
