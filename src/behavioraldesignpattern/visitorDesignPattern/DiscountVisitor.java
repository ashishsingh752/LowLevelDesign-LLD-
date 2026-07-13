package behavioraldesignpattern.visitorDesignPattern;

// Concrete Visitor 2 - Discount Visitor
public class DiscountVisitor implements ShoppingCartVisitor {

    @Override
    public double visit(Book book) {
        // 10% discount on books
        return book.getPrice() * 0.90;
    }

    @Override
    public double visit(Electronics electronics) {
        // 15% discount on electronics during sale
        return electronics.getPrice() * 0.85;
    }

    @Override
    public double visit(Cloths cloths) {
        return cloths.getPrice()* 0.90;
    }
}
