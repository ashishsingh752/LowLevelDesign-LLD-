package behavioraldesignpattern.statedesignpattern;

// Concrete State 3
public class DispensingState implements VendingMachineState {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, product is dispensing.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject coin now.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Already dispensing...");
    }

    @Override
    public void dispenseProduct() {
        machine.releaseProduct();
        if (machine.getItemCount() > 0) {
            machine.setState(machine.getNoCoinState());
        } else {
            machine.setState(machine.getOutOfStockState());
        }
    }
}
