package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_228_ArrayList_Input {
    public static void main(String[] args) {
        // names, ages - store them

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> ages = new ArrayList();

        String continuesInput = "Y"; // Control variable for input loop

        while (continuesInput.equalsIgnoreCase("Y")){

            System.out.println("Enter name: ");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter age: ");
            int age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continuesInput = sc.nextLine();
        }

    }
}
