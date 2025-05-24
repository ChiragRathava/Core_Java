package ex_18_OOPs_Constructors;

import java.util.Scanner;

public class Lab_160_Cons {
    public static void main(String[] args) {

        Car2 tesla = new Car2("tesla_3",2025);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        System.out.println(" --> ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model Name ");
        String model_name = sc.next();
        Car2 Thar = new Car2(model_name,2020);
        System.out.println(Thar.model);
        System.out.println(Thar.year);
    }
}
