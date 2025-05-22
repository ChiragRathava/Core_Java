package ex_16_Arrays;

public class Lab_138_Max_Value_Interview {
    public static void main(String[] args) {

        int[] array = {25,14,56,36,15,77,18,29,49};
        //Max,Min

        // Logic Building
        // 1 -> inputs - array -> int
        // output -> int - 77
        int max_output = give_max(array);
        System.out.println(max_output);
    }
    static int give_max(int[] array){

        //Logic
        int max = array[0]; //25
        for (int i = 0; i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
