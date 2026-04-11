package behavioraldesignpattern.templateMethodPattern;

// Concrete Class 3 - Black Coffee (uses hook differently)
public class BlackCoffeeMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("☕ Brewing strong black coffee...");
    }

    // No condiments - uses default hook
}
