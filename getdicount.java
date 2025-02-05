public class DiscountCalculator {
    // Method to calculate discount
    public static double calculateDiscount(double price, double discountRate) {
        return price * (discountRate / 100);
    }

    public static void main(String[] args) {
        double price = 500.0; // predefined price
        double discountRate = 10.0; // predefined discount rate

        double discount = calculateDiscount(price, discountRate);
        double finalPrice = price - discount;

        System.out.println("Original Price: $" + price);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Final Price After Discount: $" + finalPrice);
    }
}
