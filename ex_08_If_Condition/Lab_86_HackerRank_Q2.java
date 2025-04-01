package ex_08_If_Condition;

import java.util.Scanner;

// Triangle Classifiction
public class Lab_86_HackerRank_Q2 {

    // Logic Building
    // Step 1
    // Find the i/o
    // Input | side1,side2,side3 -> data type -> double
    // Output | SOP -> String or message -> Equilateral, Isosceles, Scalene.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter  the length of side 3: ");
        double side3 = sc.nextDouble();

        // step 2 Basic Logic | Rough Logic
        // if side1 == side2 and side2 == side3 -> side1 == side3 - Equal
        // else if side1 == side2 || side1 == side3 || side2 == side3 -> iso
        // else -> scalene

        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.println("Invalid input.");
        }
        else {

            if (side1 == side2 && side2 == side3 && side1 == side3){
                System.out.println("The tringle is Equilateral.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The tringle is isosceles.");
            } else {
                System.out.println("The tringle is scalene");
            }
        }
        sc.close();
    }
}
