package behavioraldesignpattern.statedesignpattern;

//step 3: Concrete State 1
public class NoCoinState implements VendingMachineState {
    private VendingMachine machine;

    public NoCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert coin first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert coin first.");
    }
}
