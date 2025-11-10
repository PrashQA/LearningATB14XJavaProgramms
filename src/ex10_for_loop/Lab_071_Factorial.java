package ex10_for_loop;

import java.util.Scanner;

public class Lab_071_Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        if (n == 0) {
            fact = 1;
        }

        // for (int i = n; i >=1 ; i--) {
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);






    }
}
