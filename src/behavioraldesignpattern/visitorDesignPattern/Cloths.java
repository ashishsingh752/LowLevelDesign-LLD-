package behavioraldesignpattern.visitorDesignPattern;

public class Cloths implements ItemElement{
    private String type;
    private String geneder;
    private double price ;

    public Cloths(String type, double price, String geneder) {
        this.type = type;
        this.price = price;
        this.geneder = geneder;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getGeneder() {
        return geneder;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
