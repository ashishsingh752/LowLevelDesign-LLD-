package creationaldesignpattern.abstractfactory;

// KingPremiumBurger.java
public class KingPremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing King Premium Burger: Bacon + extra cheese + jalapeños + Wheat bun + gourmet sauce");
    }

    @Override
    public void serve() {
        System.out.println("Serving King Premium Burger");
    }

    @Override
    public String getDescription() {
        return "King Premium Burger (Deluxe Wheat bun)";
    }
}
