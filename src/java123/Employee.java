package java123;
class Employee {
    private double name;
    private float employeeId;
    private double salary;

    // Constructor
    public Employee(double name, int employeeId, float salary) {
        this.name = name;
        this.employeeId = salary;
        this.employeeId = employeeId;
    }

    // Getter methods
    public double getName() {
        return name;
    }


    public float getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;
    public Manager(double name, int employeeId, float salary, String department ) {
        this.department = department;
    }
    

    public void manageTeam() {
        System.out.println("Manager " + getName() + " is managing the " + department + " team.");
    }
}


class Developer extends Employee {
    private String programmingLanguage;
    public Developer(double name, int employeeId, float salary, String department, int programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        
    }

    public void code() {
        System.out.println("Developer " + getName() + " is coding in " + programmingLanguage + ".");
    }
}

public class InheritanceHardExample {
    public static void main(String[] args) {
     
        Manager manager = new Manager("John Manager",101, 80000,);
        Developer developer = new Developer(90000,java);

        System.out.println("Manager Information:");
        manager.displayInfo();

        System.out.println("\nDeveloper Information:");
        developer.code();
    }
}