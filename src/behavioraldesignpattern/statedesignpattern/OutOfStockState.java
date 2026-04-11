package behavioraldesignpattern.statedesignpattern;

// Concrete State 4
public class OutOfStockState implements VendingMachineState {
    private VendingMachine machine;

    public OutOfStockState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Out of stock. Cannot accept coin.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Out of stock. No coin to eject.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Out of stock.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Out of stock.");
    }
}
