package ex_07_Increment_Decrement_Op;

public class Lab_72_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // method
        // Line No. | Exp(result) | a
        //      5   |   NA        | 10
        //      6   |   10        | 11
        //      7   |   10        | 11
    }
}
