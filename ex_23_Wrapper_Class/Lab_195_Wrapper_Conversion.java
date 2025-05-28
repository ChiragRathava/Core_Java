package ex_23_Wrapper_Class;

public class Lab_195_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";

        // String -> Wrapper conversion
        Integer a = Integer.parseInt(num);
        System.out.println(a);

        // String to Primitive
        int a3 = Integer.parseInt(num);
        System.out.println(a3);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer aa = Integer.valueOf("10");
        System.out.println(aa);
    }

}
