package creationaldesignpattern.abstractfactory;

//4. Abstract Factory
// BurgerFactory.java
public interface BurgerFactory {
    Burger createBasicBurger();
    Burger createModerateBurger();
    Burger createPremiumBurger();
}
