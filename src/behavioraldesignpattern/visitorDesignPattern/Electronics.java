package behavioraldesignpattern.visitorDesignPattern;

// Concrete Element 2
public class Electronics implements ItemElement {
    private String name;
    private double price;
    private double taxRate;

    public Electronics(String name, double price, double taxRate) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
    }

    public double getPrice() { return price; }
    public double getTaxRate() { return taxRate; }
    public String getName() { return name; }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
