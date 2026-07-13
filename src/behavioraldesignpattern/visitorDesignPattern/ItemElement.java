package behavioraldesignpattern.visitorDesignPattern;

//Step 1: // Element Interface
public interface ItemElement {
    double accept(ShoppingCartVisitor visitor);
}
