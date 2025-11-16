package ex35_Coding_Problem;

public class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to create and display Person objects
    public static void main(String[] args) {
        // Creating two Person instances
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        // Displaying their details
        person1.displayDetails();
        person2.displayDetails();
    }
}


