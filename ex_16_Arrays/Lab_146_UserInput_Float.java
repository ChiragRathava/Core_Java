package ex_16_Arrays;

import java.util.Scanner;

public class Lab_146_UserInput_Float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        float[] numbers = new float[size];

//        for (int i = 0; i < size; i++) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number");
            numbers[i] = sc.nextFloat();
        }
        System.out.println(" --- ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
