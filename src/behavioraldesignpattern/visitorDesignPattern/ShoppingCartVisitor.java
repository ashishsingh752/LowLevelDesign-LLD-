package behavioraldesignpattern.visitorDesignPattern;

//step 3:
// Visitor Interface
public interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Electronics electronics);
    double visit(Cloths cloths);
}
