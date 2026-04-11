package behavioraldesignpattern.statedesignpattern;

//Step 1: State Interface
public interface VendingMachineState {
    void insertCoin();
    void ejectCoin();
    void selectProduct();
    void dispenseProduct();
}
