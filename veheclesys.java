CT101/G/21120/23
Shadrack Omondi
// Base class Vehicle representing a generic vehicle
class Vehicle {
    protected String brand;
    protected int speed;

    // Constructor for Vehicle
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to increase speed
    public void accelerate(int increase) {
        speed += increase;
    }

    // Method to decrease speed, ensuring it doesn't go below zero
    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) {
            speed = 0;
        }
    }

    // Method to display vehicle details (to be overridden by subclasses)
    public void showDetails() {
        System.out.println("This is a vehicle.");
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    private int fuelLevel;

    // Constructor for Car
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    // Method to refuel the car, ensuring fuel level does not exceed 100%
    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
    }

    // Overridden method to display car details
    @Override
    public void showDetails() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h, Fuel Level: " + fuelLevel + "%");
    }
}

// Subclass Bike inheriting from Vehicle
class Bike extends Vehicle {
    private boolean helmetOn;

    // Constructor for Bike
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    // Method to wear a helmet
    public void wearHelmet() {
        helmetOn = true;
    }

    // Overridden method to display bike details
    @Override
    public void showDetails() {
        System.out.println("Bike Brand: " + brand + ", Speed: " + speed + " km/h, Helmet On: " + helmetOn);
    }
}

// Main class to demonstrate the vehicle system
public class VehicleSystem {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car("Toyota", 60, 50);
        // Creating a Bike object
        Bike bike = new Bike("Yamaha", 40, false);

        // Performing operations on the car
        car.accelerate(20); // Increasing speed by 20
        car.brake(30); // Decreasing speed by 30
        car.refuel(30); // Refueling by 30%
        car.showDetails(); // Displaying car details

        // Performing operations on the bike
        bike.accelerate(15); // Increasing speed by 15
        bike.brake(10); // Decreasing speed by 10
        bike.wearHelmet(); // Wearing helmet
        bike.showDetails(); // Displaying bike details
    }
}
