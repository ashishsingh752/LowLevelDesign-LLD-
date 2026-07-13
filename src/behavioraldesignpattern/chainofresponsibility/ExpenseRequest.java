package behavioraldesignpattern.chainofresponsibility;

// Request Object
public class ExpenseRequest {
    private double amount;
    private String purpose;
    private String employeeName;

    public ExpenseRequest(double amount, String purpose, String employeeName) {
        this.amount = amount;
        this.purpose = purpose;
        this.employeeName = employeeName;
    }

    public double getAmount() { return amount; }
    public String getPurpose() { return purpose; }
    public String getEmployeeName() { return employeeName; }

    @Override
    public String toString() {
        return employeeName + " requested ₹" + amount + " for " + purpose;
    }
}
