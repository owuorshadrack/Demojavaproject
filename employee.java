// Employees class
class Employees {
    // Attributes
    private String name;
    private double salary;

    // Constructor to initialize the attributes
    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display the employee's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// SalaryCalculator class
class SalaryCalculator {
    // Method to calculate bonus
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

// MainApp class
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input to create an Employee object
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Create an Employee object
        Employees emp = new Employees(name, salary);

        // Use the SalaryCalculator class to compute the bonus
        SalaryCalculator sc = new SalaryCalculator();
        double bonus = sc.calculateBonus(salary);

        // Display the employee details along with the calculated bonus
        emp.displayDetails();
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}