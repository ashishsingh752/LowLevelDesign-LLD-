package behavioraldesignpattern.chainofresponsibility;

//Step 4: Client Code
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Create handlers
        ExpenseHandler teamLead = new TeamLeadHandler();
        ExpenseHandler manager = new ManagerHandler();
        ExpenseHandler director = new DirectorHandler();
        ExpenseHandler ceo = new CEOHandler();

        // Build the chain: TeamLead → Manager → Director → CEO
        teamLead.setNextHandler(manager);
        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        System.out.println("=== Expense Approval Chain ===\n");

        // Test different requests
        ExpenseRequest req1 = new ExpenseRequest(3000, "Team Lunch", "Ashish");
        System.out.println("Request 1: " + req1);
        teamLead.handleRequest(req1);

        System.out.println("\n--- Next Request ---\n");

        ExpenseRequest req2 = new ExpenseRequest(45000, "New Laptop", "Priya");
        System.out.println("Request 2: " + req2);
        teamLead.handleRequest(req2);

        System.out.println("\n--- Next Request ---\n");

        ExpenseRequest req3 = new ExpenseRequest(300000, "International Conference", "Rahul");
        System.out.println("Request 3: " + req3);
        teamLead.handleRequest(req3);

        System.out.println("\n--- High Amount Request ---\n");

        ExpenseRequest req4 = new ExpenseRequest(800000, "Office Renovation", "Neha");
        System.out.println("Request 4: " + req4);
        teamLead.handleRequest(req4);
    }
}

