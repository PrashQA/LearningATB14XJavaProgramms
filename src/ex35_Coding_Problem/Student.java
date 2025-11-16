package ex35_Coding_Problem;

public class Student {
    // Attributes
    String name;
    int rollNo;
    String section;

    // Constructor
    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student("Bob", 101, "A");

        // Displaying student details
        student1.printDetails();
    }


}
