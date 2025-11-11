package ex17_OOPS;

public class Lab124_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Pramod");
    }
}

class Student {
    String name;

    // DC
    Student() {
        System.out.println("DC -> Hi, i am called.");
    }

    // PC
    Student(String name) {
        System.out.println("PC -> Hi," + name);
    }


    void sleep() {
    }

    void study() {
    }

    void eat() {
    }
}
