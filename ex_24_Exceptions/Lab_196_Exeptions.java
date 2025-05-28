package ex_24_Exceptions;

public class Lab_196_Exeptions {
    public static void main(String[] args) {

        System.out.println("Start the program");
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException / Index 0 out of bound

        int a = Integer.parseInt(ip); // java.lang.NumberFormatException / For input string -> "chirag"

        int b = 100/a; // java.lang.ArithmeticException / by zero when args -> 0

        System.out.println(b);
        System.out.println("End the program");

        // java.lang.ArithmeticException / by zero when args -> 0
        // java.lang.NumberFormatException / For input string -> "chirag"
        // java.lang.ArrayIndexOutOfBoundsException / Index 0 out of bound
    }
}
