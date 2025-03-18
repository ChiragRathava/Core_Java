package ex_04_Operators;

/*
 * < -> Less Than
 *  <= -> Less than or equal to
 *  > -> Greater
 * >= -> Greater or equal
 * == -> Equal to (but checking)
 * != -> Not equal */
// All of them will result boolean output.

public class Lab_41_Relational {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        boolean c1 = a > b;
        boolean c2 = a < b;
        System.out.println(c1);
        System.out.println(c2);

        boolean d = b > a;
        System.out.println(d);

        int My_age = 21;
        int satish_age = 21;
        boolean result1 = My_age >= satish_age;
        System.out.println(result1);

        int paresh_age = 28;
        boolean result2 = My_age >= paresh_age;
        System.out.println(result2);
    }
}
