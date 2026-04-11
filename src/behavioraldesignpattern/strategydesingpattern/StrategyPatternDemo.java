package behavioraldesignpattern.strategydesingpattern;

interface PaymentStrategy{
    void pay(double amount);
}

class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;

    public CreditCardStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment done through Credit card, amount: "+amount);
    }
}


class UPIStrategy implements PaymentStrategy{
    private String upiId;

    public UPIStrategy(String upiId){
        this.upiId  = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment done through UPI, with UPI ID : "+upiId);
    }
}


class PayPalStrategy implements PaymentStrategy{
    private String  emailId;

    public PayPalStrategy   (String emailId){
        this.emailId = emailId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payement done through Paypal with emailId: "+emailId);
    }
}

// Context Class

class ShoppingCart{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy= paymentStrategy;
    }

    public  void checkout(double amount ){
        if (paymentStrategy==null){
            throw new IllegalStateException("not ");
        }
        paymentStrategy.pay(amount);
    }
}



public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using UPI
        cart.setPaymentStrategy(new UPIStrategy("ashish@upi"));
        cart.checkout(1500.0);

        // Change strategy at runtime - P ay using Credit Card
        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9012-3456"));
        cart.checkout(2500.0);

        // Change again - Pay using PayPal
        cart.setPaymentStrategy(new PayPalStrategy("ashish@example.com"));
        cart.checkout(800.0);
    }
}
