package ex_07_Increment_Decrement_Op;

public class Lab_73_Advance_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // A + B
        // A -> a++ -> Exp -> 10, a -> 11
        // +
        // B -> a -> a -> 11 -> Exp -> 11
        // A + B -> 10 + 11 -> 21
    }
}
