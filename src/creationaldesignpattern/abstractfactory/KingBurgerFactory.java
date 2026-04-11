package creationaldesignpattern.abstractfactory;

//5. Concrete Factories
// KingBurgerFactory.java
public class KingBurgerFactory implements BurgerFactory {

    @Override
    public Burger createBasicBurger() {
        return new KingBasicBurger();
    }

    @Override
    public Burger createModerateBurger() {
        return new KingModerateBurger();
    }

    @Override
    public Burger createPremiumBurger() {
        return new KingPremiumBurger();
    }
}
