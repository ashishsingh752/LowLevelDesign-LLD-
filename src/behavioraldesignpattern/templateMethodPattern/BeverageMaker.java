package behavioraldesignpattern.templateMethodPattern;

// Abstract Class with Template Method
public abstract class BeverageMaker {

    // Template Method - Final so subclasses cannot override the sequence
    public final void prepareBeverage() {

        boilWater();
        brew();
        pourIntoCup();
        System.out.println("Hi Ashish! are you waiting for you beverage ??");
        addCondiments();
        serve();
    }


    // Common steps (implemented in base class)
    private void boilWater() {
        System.out.println("✅ Boiling water...");
    }

    private void pourIntoCup() {
        System.out.println("✅ Pouring into cup...");
    }

    private void serve() {
        System.out.println("✅ Beverage is ready! Enjoy ☕\n");
    }

    // Steps to be implemented by subclasses
    protected abstract void brew();

    // Hook method - subclasses can override if needed (optional step)
    protected void addCondiments() {
        // Default implementation - does nothing
        System.out.println("No condiments added.");
    }
}
