package ex35_Coding_Problem;

// Base class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}
// Main class to test polymorphism
public class AnimalSoundTest {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling overridden methods
        dog.makeSound(); // Output: Dog says: Woof! Woof!
        cat.makeSound(); // Output: Cat says: Meow! Meow!
    }




}
