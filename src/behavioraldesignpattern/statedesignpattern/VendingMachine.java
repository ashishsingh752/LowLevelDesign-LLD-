package behavioraldesignpattern.statedesignpattern;

// step 2: Context
public class VendingMachine {
    private VendingMachineState currentState;

    // Different states
    private final VendingMachineState noCoinState;
    private final VendingMachineState hasCoinState;
    private final VendingMachineState dispensingState;
    private final VendingMachineState outOfStockState;

    private int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;

        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        outOfStockState = new OutOfStockState(this);

        // Initial state
        if (itemCount > 0) {
            currentState = noCoinState;
        } else {
            currentState = outOfStockState;
        }
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    // Delegate actions to current state
    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public void releaseProduct() {
        if (itemCount > 0) {
            System.out.println("Dispensing product... Enjoy!");
            itemCount--;
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    // Getters for states
    public VendingMachineState getNoCoinState() { return noCoinState; }
    public VendingMachineState getHasCoinState() { return hasCoinState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfStockState() { return outOfStockState; }
}
