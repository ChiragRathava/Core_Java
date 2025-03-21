package ex_07_Increment_Decrement_Op;

public class Lab_68_in_de_op {
    public static void main(String[] args) {
//        int age = 21;
//        String result = (age < 21) ? "go home" : "go goa";
//        System.out.println(result);

        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

        String can_i_Drink = age >= 24 ? "Yes" : "No";
        System.out.println(can_i_Drink);

    }

}
