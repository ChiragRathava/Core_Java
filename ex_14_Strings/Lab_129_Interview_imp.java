package ex_14_Strings;

public class Lab_129_Interview_imp {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP -> 1
        String s4 = "Hello"; // SCP -> 2

        String s2 = new String("Hello");// OA -> 1
        String s3 = new String("Hello");// OA -> 2
        String s5 = new String("hello");// OA -> 3

        // == ? Comparsion
        // But
        // In of Strings -> This check the locations ref.
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false

        System.out.println(s1 == s4); // true
        System.out.println(s3 == s5); // false


        // equals (content) -> value
            // How can I check the value ? equal == value

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        // equalsIgnoreCase -> chirag, Chirag, CHIRAG, CHIrag
        // it is all same

    }
}
