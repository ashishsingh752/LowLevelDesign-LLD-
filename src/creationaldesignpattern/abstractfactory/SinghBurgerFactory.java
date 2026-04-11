package creationaldesignpattern.abstractfactory;

// SinghBurgerFactory.java
public class SinghBurgerFactory implements BurgerFactory {

    @Override
    public Burger createBasicBurger() {
        return new SinghBasicBurger();
    }

    @Override
    public Burger createModerateBurger() {
        return new SinghModerateBurger();
    }

    @Override
    public Burger createPremiumBurger() {
        return new SinghPremiumBurger();
    }
}
