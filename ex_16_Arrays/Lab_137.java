package ex_16_Arrays;

import java.util.Arrays;

public class Lab_137 {
    public static void main(String[] args) {
        int[] marks = {12,13,18,21,25};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println(" -----");

        for (int i = 0; i < marks.length; i++){ //0,1,2,3,4
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
    }
}
