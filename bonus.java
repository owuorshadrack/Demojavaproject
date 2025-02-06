import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Ask user for their years of service
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonusPercentage;

        // Compute the bonus percentage based on years of service
        if (yearsOfService > 10) {
            bonusPercentage = 0.12;
        } else if (yearsOfService >= 6) {
            bonusPercentage = 0.10;
        } else {
            bonusPercentage = 0.08;
        }

        // Calculate the net bonus
        double netBonus = salary * bonusPercentage;

        // Print the net bonus
        System.out.println("Your net bonus is: " + netBonus);
    }
}
