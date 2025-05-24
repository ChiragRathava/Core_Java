package ex_18_OOPs_Constructors;

public class Lab_159_Car {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.name); // Default
        tesla.name = "Tesla Model 3";
        System.out.println(tesla.name);
        System.out.println(tesla.year); // Default
        tesla.year = 2025;
        System.out.println(tesla.year);

        System.out.println(" --- ");

        Car Thar = new Car();
        Thar.name = "Thar";
        System.out.println(Thar.name);
    }
}
