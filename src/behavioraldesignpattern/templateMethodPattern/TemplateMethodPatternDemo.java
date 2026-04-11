package behavioraldesignpattern.templateMethodPattern;

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== Preparing Tea ===");
        BeverageMaker tea = new TeaMaker();
        tea.prepareBeverage();

        System.out.println("=== Preparing Coffee ===");
        BeverageMaker coffee = new CoffeeMaker();
        coffee.prepareBeverage();

        System.out.println("=== Preparing Black Coffee ===");
        BeverageMaker blackCoffee = new BlackCoffeeMaker();
        blackCoffee.prepareBeverage();
    }
}