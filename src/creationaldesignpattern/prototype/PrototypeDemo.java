package creationaldesignpattern.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        // Create the original prototype (costly object)
        Employee original = new Employee("Ashish", "Engineering", "Pune", 80000);
        System.out.println("Original: " + original);

        // Clone it multiple times (very cheap)
        Employee clone1 = (Employee) original.clone();
        clone1.setName("Rahul");
        clone1.setSalary(90000);

        Employee clone2 = (Employee) original.clone();
        clone2.setName("Priya");
        clone2.setDepartment("HR");

        System.out.println("Clone 1 : " + clone1);
        System.out.println("Clone 2 : " + clone2);
        System.out.println("Original after cloning: " + original);  // unchanged
    }
}