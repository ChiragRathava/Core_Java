package ex_16_Arrays;

public class Lab_135 {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5,6};

        //2nd
        int[] marks2 =new int[5]; //Fixed Size
        System.out.println(marks2.length); //array property

        String s1 = "Chirag";
        System.out.println(s1.length()); // function

        marks2[0]=127;
        marks2[1]=128;
        marks2[2]=129;
        marks2[3]=130;
        marks2[4]=131;

        System.out.println(marks2[0]);
        System.out.println(marks2[4]);
//        System.out.println(marks2[10]);

    }
}
