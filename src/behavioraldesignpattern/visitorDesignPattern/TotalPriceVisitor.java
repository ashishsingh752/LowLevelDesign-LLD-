package behavioraldesignpattern.visitorDesignPattern;

//step 4: // Concrete Visitor 1 - Total Price Calculator
public class TotalPriceVisitor implements ShoppingCartVisitor {

    @Override
    public double visit(Book book) {
        return book.getPrice();
    }

    @Override
    public double visit(Electronics electronics) {
        // Electronics have 18% GST
        return electronics.getPrice() + (electronics.getPrice() * electronics.getTaxRate());
    }

    @Override
    public double visit(Cloths cloths) {
        return cloths.getPrice();
    }
}
