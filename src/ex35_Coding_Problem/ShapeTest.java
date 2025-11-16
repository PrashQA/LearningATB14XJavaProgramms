package ex35_Coding_Problem;
// Abstract base class
abstract class Shape {
    // Abstract method to be implemented by subclasses
    public abstract double getArea();
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test the implementation


public class ShapeTest {
    public static void main(String[] args) {
        // Creating Rectangle and Circle objects
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        // Displaying areas
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }


}

