package behavioraldesignpattern.templateMethodPattern;

// Concrete Class 2 - Coffee
public class CoffeeMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("☕ Brewing coffee grounds with hot water...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("🥛 Adding milk and sugar...");
    }
}
