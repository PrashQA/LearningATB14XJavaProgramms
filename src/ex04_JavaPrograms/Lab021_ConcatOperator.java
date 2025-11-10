package ex04_JavaPrograms;

public class Lab021_ConcatOperator {
    public static void main(String[] args) {

        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);

        //         // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));
    }
}
