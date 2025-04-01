package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_83_If_elseif_Else {
    public static void main(String[] args) {
        // num1 and num2
        // num1 > num2
        // num1 < num2
        // num1 == num2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println("num2");
        }else {
            System.out.println("equal");
        }
    }
}
