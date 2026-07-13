package behavioraldesignpattern.visitorDesignPattern;

//Step 2: 
// Concrete Element 1
public class Book implements ItemElement {
    private String title;
    private double price;
    private String isbn;

    public Book(String title, double price, String isbn) {
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }

    public double getPrice() { return price; }
    public String getTitle() { return title; }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
