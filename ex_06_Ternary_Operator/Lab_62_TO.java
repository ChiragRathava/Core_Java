package ex_06_Ternary_Operator;

public class Lab_62_TO {
    public static void main(String[] args) {
        //result = condition ? expression1 ? expression2
        int number_1 = -5;
        String result_1 = number_1 > 0 ? "Positive" : "Negative";
        System.out.println(result_1);

        int number_2 = 5;
        String result_2 = number_2 > 0 ? "Positive" : "Negative";
        System.out.println(result_2);
    }
}