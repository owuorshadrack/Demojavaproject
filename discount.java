import java.util.Scanner;

public class DiscountCalculatorUserInput {
    // Method to calculate discount
    public static double calculateDiscount(double price, double discountRate) {
        return price * (discountRate / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the original price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the discount rate (%): ");
        double discountRate = scanner.nextDouble();

        double discount = calculateDiscount(price, discountRate);
        double finalPrice = price - discount;

        // Displaying results
        System.out.println("Original Price: $" + price);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Final Price After Discount: $" + finalPrice);

        scanner.close();
    }
}
