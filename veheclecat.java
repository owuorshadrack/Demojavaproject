CT101/G/21120/23
Shadrack Omondi

import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor to initialize vehicle details
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    private String fuelType;

    // Constructor that initializes all fields, including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // call base class constructor
        this.fuelType = fuelType;
    }

    // Overridden method to display car details including fuel type
    @Override
    public void displayDetails() {
        super.displayDetails(); // display base vehicle details
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Showroom class with main method to interact with the user
public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for vehicle details
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create a Car object using the provided data
        Car car = new Car(brand, model, year, fuelType);

        // Display the car details
        System.out.println("\nDisplaying Car Details:");
        car.displayDetails();

        scanner.close();
    }
}