package ex16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab111_User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");
        int size = scanner.nextInt();

        String[] numbers_marks =  new String[size];

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the elements -> " + i);
            numbers_marks[i] = scanner.next();
        }

        System.out.println(" --- Print the values");

        Arrays.sort(numbers_marks);
        for(String marks : numbers_marks){
            System.out.println(marks);
        }


    }
}
