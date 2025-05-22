package ex_16_Arrays;

public class Lab_139_Min_Value_Interview {
    public static void main(String[] args) {

        int[] array = {25,14,56,36,15,77,18,29,49};
        //Max,Min

        // Logic Building
        // 1 -> inputs - array -> int
        // output -> int - 77
        int min_output = give_min(array);
        System.out.println(min_output);
    }
    static int give_min(int[] array){

        //Logic
        int min = array[0]; //25
        for (int i = 0; i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
