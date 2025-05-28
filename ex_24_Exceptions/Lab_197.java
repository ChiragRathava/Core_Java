package ex_24_Exceptions;

public class Lab_197 {
    public static void main(String[] args) {

        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);
        // Unchecked
        // java.lang.ArithmeticException: / by zero - UnChecked - JVM doen't know
    }
}
