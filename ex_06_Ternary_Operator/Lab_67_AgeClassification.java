package ex_06_Ternary_Operator;

public class Lab_67_AgeClassification {
    public static void main(String[] args) {
//        int age = 21;

        // Adult, Minor, Senior
        // Senior > 65
        // Minor < 18
        // Adult > 18

        // How to take User Input
        // 1. CLI -> Command line

        String age_string = args[0]; // 75
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(args[1]); // 21
        System.out.println(args[2]); // 17
//        System.out.println(args[3]); // java.lang.ArrayIndexOutOfBoundsException

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
