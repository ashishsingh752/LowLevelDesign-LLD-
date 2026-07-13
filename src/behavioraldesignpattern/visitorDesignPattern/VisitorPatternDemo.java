package behavioraldesignpattern.visitorDesignPattern;

//step 5:
import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        List<ItemElement> cart = new ArrayList<>();

        cart.add(new Book("Design Patterns", 1299.0, "ISBN-1234"));
        cart.add(new Book("Clean Code", 899.0, "ISBN-5678"));
        cart.add(new Electronics("Wireless Headphones", 2499.0, 0.18));
        cart.add(new Electronics("Smart Watch", 3999.0, 0.18));
        cart.add(new Cloths("Shirt", 1000, "Male"));

        System.out.println("=== Shopping Cart Items ===");

        // Calculate Total Price
        ShoppingCartVisitor priceVisitor = new TotalPriceVisitor();
        double totalPrice = 0;
        for (ItemElement item : cart) {
            totalPrice += item.accept(priceVisitor);
        }
        System.out.printf("Total Price (incl. tax): ₹%.2f%n", totalPrice);

        System.out.println("\n=== Applying Festival Discount ===");

        // Apply Discount
        ShoppingCartVisitor discountVisitor = new DiscountVisitor();
        double discountedTotal = 0;
        for (ItemElement item : cart) {
            discountedTotal += item.accept(discountVisitor);
        }
        System.out.printf("Discounted Total: ₹%.2f%n", discountedTotal);
    }
}