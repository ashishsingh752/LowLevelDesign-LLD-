package behavioraldesignpattern.chainofresponsibility;

// Level 4 Handler (Final)
public class CEOHandler extends ExpenseHandler {
    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmount() <= 500000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("✅ Approved by CEO: " + request);
    }
}
