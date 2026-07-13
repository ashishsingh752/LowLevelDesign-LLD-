package behavioraldesignpattern.chainofresponsibility;

//Step 3: Concrete Handlers
// Level 1 Handler
public class TeamLeadHandler extends ExpenseHandler {
    @Override
    protected boolean canApprove(ExpenseRequest request) {
        return request.getAmount() <= 5000;
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("✅ Approved by Team Lead: " + request);
    }
}
