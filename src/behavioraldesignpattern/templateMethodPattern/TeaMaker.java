package behavioraldesignpattern.templateMethodPattern;

// Concrete Class 1 - Tea
public class TeaMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("🍵 Steeping the tea bag for 3 minutes...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("🍋 Adding lemon and sugar...");
    }
}
