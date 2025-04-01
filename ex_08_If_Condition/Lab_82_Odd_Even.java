package ex_08_If_Condition;

import java.util.Scanner;

// Create a Program - Task user input
// Check wether the input is even or odd number
public class Lab_82_Odd_Even {
    public static void main(String[] args) {

        // Step 1 : Figure out inputs and output
        // number (int) -> i/o -> Scanner Class can be used to take input
        // string -> odd or even -> o/p, println
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int number: ");
        int num = sc.nextInt();

        // step 2 : Logic Rough
        // num%2 == 0 -> even - modulus - R == 0 -> even
        // num%2 != 0 -> odd ->

        // step 3 : Logic write
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        sc.close(); // stop taking input now.

        // step 4 : edge cases
        // largeg int , -ve handle, zero, other input
    }
}
