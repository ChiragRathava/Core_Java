package ex_04_Operators;

public class Lab_45_Logical {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a);

        boolean b = false;
        System.out.println(!!b);

        System.out.println("\n");

        // OR gate
        boolean c1 = true || true;
        System.out.println(c1);
        boolean c2 = false || true;
        System.out.println(c2);
        boolean c3 = true || false;
        System.out.println(c3);
        boolean c4 = false || false;
        System.out.println(c4);

        System.out.println("\n");

        //AND gate
        boolean d1 = true && true;
        System.out.println(d1);
        boolean d2 = false & true;
        System.out.println(d2);
        boolean d3 = true && false;
        System.out.println(d3);
        boolean d4 = false & false;
        System.out.println(d4);
    }
}
