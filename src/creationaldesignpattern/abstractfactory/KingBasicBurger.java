package creationaldesignpattern.abstractfactory;

// 2. Concrete Products – KingBurger Family (Wheat style)
// KingBasicBurger.java
public class KingBasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing King Basic Burger: Simple Amul patty + Wheat bun + lettuce");
    }

    @Override
    public void serve() {
        System.out.println("Serving King Basic Burger");
    }

    @Override
    public String getDescription() {
        return "King Basic Burger (Wheat bun)";
    }
}
