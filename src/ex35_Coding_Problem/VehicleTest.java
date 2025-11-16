package ex35_Coding_Problem;
// Base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starts with a roar!");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}

// Main class to test polymorphism

public class VehicleTest {
    public static void main(String[] args) {
        // Creating an array of Vehicle references
        Vehicle[] vehicles = {new Car(), new Bike()};

        // Calling start() on each vehicle
        for (Vehicle v : vehicles) {
            v.start(); // Runtime polymorphism in action
        }
    }

}

