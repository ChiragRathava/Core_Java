package ex_16_Arrays;
// 2nd method

// for Each loop (only works with arrays and collection framework) - Enhanced For loop
public class Lab_142_Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] numbers = {12,34,10};
        // int sum = 0; -> 12+34+10 -> 56
        int sum = 0;
        for (int n : numbers){
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
