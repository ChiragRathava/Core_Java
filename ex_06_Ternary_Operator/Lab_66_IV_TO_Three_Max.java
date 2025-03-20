package ex_06_Ternary_Operator;

public class Lab_66_IV_TO_Three_Max {
    public static void main(String[] args) {
        // Finding the larges number, n1, n2, n3 => max(n1,n2,n3)

        // Step - 1: Find inputs / Outputs
        // n1,n2,n3 -> data type -> int
        // o/p -> int
        // 23,34,10 -> 34

        // Step 2: rough logic
//        n1 >= n2 -> Y1 : N1
//        Y1 -> n1 >= n3 : Y(n1) : N(n3)
//        N1 -> n2 > n3 : Y(n2) : N (n3)

        int n1 = 2, n2 = 9, n3 = -11;

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Larger Number: " + largest);

        int a1 = 100, a2 = 34 , a3 = 10;

        int largest_1 = (a1 >= a2) ? ((a1 >= a3) ? a1 : a3) : ((a2 >= a3) ? a2 : a3);
        System.out.println("Largest Number: " + largest_1);
    }
}
