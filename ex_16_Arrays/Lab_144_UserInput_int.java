package ex_16_Arrays;

import java.util.Scanner;

public class Lab_144_UserInput_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

//        for (int i = 0; i < size; i++) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number");
            numbers[i] = sc.nextInt();
        }
        System.out.println(" --- ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
