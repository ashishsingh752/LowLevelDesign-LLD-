package behavioraldesignpattern.chainofresponsibility;

// Level 3 Handler
public class DirectorHandler extends ExpenseHandler {
    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmount() <= 100000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("✅ Approved by Director: " + request);
    }
}
