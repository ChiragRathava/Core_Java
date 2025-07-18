package ex_25_Generics;
// Max three
public class Lab_248 {

    public static <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c){

        // DT custom class created
        // Comparable - int, double, string

        DT max = a;
        if (b.compareTo(max) > 0){ max = b; }
        if (c.compareTo(max) > 0){ max = c; }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34,58,76));
        System.out.println(maximumOf(4.3,6.3,5.6));
        System.out.println(maximumOf("p","w","c"));

    }
}
