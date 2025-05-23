package ex_16_Arrays;

import java.util.Scanner;

public class Lab_145_UserInput_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        String[] names = new String[size];

//        for (int i = 0; i < size; i++) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the number");
            names[i] = sc.next();
        }
        System.out.println(" --- ");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
