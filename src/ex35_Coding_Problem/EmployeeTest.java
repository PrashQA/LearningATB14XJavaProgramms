package ex35_Coding_Problem;
// Base class
abstract class Employe {
    String name;

    public Employe(String name) {
        this.name = name;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();
}

// Manager subclass
class Manager extends Employe {
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Developer subclass
class Developer extends Employe {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to test the hierarchy


public class EmployeeTest {
    public static void main(String[] args) {
        // Creating Manager and Developer objects
        Employe manager = new Manager("Alice", 60000, 10000);
        Employe developer = new Developer("Bob", 50, 160);

        // Displaying salaries
        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }


}
