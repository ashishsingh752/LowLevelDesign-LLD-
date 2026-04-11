package creationaldesignpattern.prototype;

// Concrete Prototype
public class Employee implements Prototype, Cloneable {

    private String name;
    private String department;
    private String address;        // mutable object for deep copy demo
    private int salary;

    public Employee(String name, String department, String address, int salary) {
        this.name = name;
        this.department = department;
        this.address = address;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", dept=" + department +
                ", address=" + address + ", salary=" + salary + "]";
    }

    // Cloning method - Shallow Copy
    @Override
    public Prototype clone() {
        try {
            return (Employee) super.clone();   // Calls Object's clone()
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed", e);
        }
    }
}
