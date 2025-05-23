package ex_16_Arrays;

import java.util.Arrays;

//Find Second Largest Number in an Array
public class Lab_143_Interview {
    public static void main(String[] args) {
        int[] numbers ={12,34,10,1};
        Arrays.sort(numbers);// 1,10,12,34
//        System.out.println(numbers[2]); // 12
        System.out.println(numbers[numbers.length-2]); // 12
    }
}
