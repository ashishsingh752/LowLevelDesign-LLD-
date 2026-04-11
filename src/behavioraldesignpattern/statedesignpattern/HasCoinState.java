package behavioraldesignpattern.statedesignpattern;

// Concrete State 2
public class HasCoinState implements VendingMachineState {
    private VendingMachine machine;

    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You already inserted a coin.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected.");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected.");
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select product first.");
    }
}
