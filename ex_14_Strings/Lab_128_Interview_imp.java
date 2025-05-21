package ex_14_Strings;

public class Lab_128_Interview_imp {
    public static void main(String[] args) {
        String s1 = "Hello";
        // where it is store
        // SCP
        String s4 = "Hello";
        // How many string are in SCP
        // Ans. 1
        // because "Hello" is already in SCP
        String s10 = "Hello";
        // How many string are in SCP
        // Ans. 1


        String s2 = new String("Chirag");
        // where it is store
        // Ans. OA (Object Area)
        // How many string are in OA
        // Ans. 1
        String s3 = new String("Chirag");
        // How many string are in OA
        // Ans. 2
        // because of new keyword
        String s5 = new String("Chirag");
        // How many string are in OA
        // Ans. 3

    }
}
