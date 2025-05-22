package ex_16_Arrays;

public class Lab_136 {
    public static void main(String[] args) {
        String[] names = {"Chirag","Rathava","Hi!"};

        String[] name = new String[3];
        name[0] = "Paresh";
        name[1] = "Viju";
        name[2] = "Rahul";
        System.out.println(name.length);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data.length);
    }
}
