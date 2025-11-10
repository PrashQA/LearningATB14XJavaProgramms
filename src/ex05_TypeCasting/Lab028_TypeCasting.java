package ex05_TypeCasting;

public class Lab028_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening -> Implicit Casting - Automatically done.
        int a1 = (int) b; // Valid Syntax -> Widening -> Explicit Casting - not requred
    }
}
