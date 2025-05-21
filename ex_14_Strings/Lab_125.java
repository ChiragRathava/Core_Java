package ex_14_Strings;

public class Lab_125 {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat("World");
        System.out.println(s1); // Hello

        s1 = s1.concat("World");
        System.out.println(s1); // HelloWorld

        String s2 = new String("Rathava");
    }
}
