package ex_15_Strings_Functions;

public class Lab_132 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"

        System.out.println(s3);
        System.out.println(s1.concat(s2));

        StringBuilder sb = new StringBuilder("Chirag");
        sb.append("Rathava");
        System.out.println(sb);
        // StringBuilder is not create a new string
        // It is modify the existing string and store
    }
}
