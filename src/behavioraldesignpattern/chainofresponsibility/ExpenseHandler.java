package behavioraldesignpattern.chainofresponsibility;

//Step 2: Handler Interface (Abstract Handler)
// Abstract Handler
public abstract class ExpenseHandler {
    protected ExpenseHandler nextHandler;

    public void setNextHandler(ExpenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(ExpenseRequest request) {
        if (canApprove(request)) {
            approve(request);
        } else if (nextHandler != null) {
            System.out.println(this.getClass().getSimpleName() + " cannot approve ₹" + request.getAmount() + ". Forwarding to next...");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("❌ Request rejected: No one can approve ₹" + request.getAmount());
        }
    }

    protected abstract boolean canApprove(ExpenseRequest request);
    protected abstract void approve(ExpenseRequest request);
}
