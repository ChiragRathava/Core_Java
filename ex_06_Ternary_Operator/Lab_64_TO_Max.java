package ex_06_Ternary_Operator;

public class Lab_64_TO_Max {
    public static void main(String[] args) {
        // Find the maximum number between two number
        // X and Y -> Max X, y -> Ternary

        int x = 10;
        int y = 20;
        int max = x > y  ? x : y;
        System.out.println(max);

        String max1 = x > y ? "X is max" : "Y is max";
        System.out.println(max1);
    }
}
