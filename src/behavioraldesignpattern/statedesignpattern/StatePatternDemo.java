package behavioraldesignpattern.statedesignpattern;

public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(3);  // 3 items available

        System.out.println("=== Vending Machine Demo ===\n");

        machine.insertCoin();
        machine.selectProduct();
        machine.dispenseProduct();

        System.out.println("\n--- Second Transaction ---\n");

        machine.insertCoin();
        machine.ejectCoin();        // Test eject

        machine.insertCoin();
        machine.selectProduct();
        machine.dispenseProduct();

        System.out.println("\n--- Third Transaction ---\n");

        machine.insertCoin();
        machine.ejectCoin();
        machine.insertCoin();
        machine.insertCoin();
//        machine.selectProduct();
//        machine.dispenseProduct();

        System.out.println("\nItems left: " + machine.getItemCount());
//        machine.insertCoin();
//        machine.selectProduct();
        machine.dispenseProduct();
    }
}
