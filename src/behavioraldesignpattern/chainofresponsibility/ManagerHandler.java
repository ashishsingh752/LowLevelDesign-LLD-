package behavioraldesignpattern.chainofresponsibility;

// Level 2 Handler
public class ManagerHandler extends ExpenseHandler {
    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmount() <= 25000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("✅ Approved by Manager: " + request);
    }
}
