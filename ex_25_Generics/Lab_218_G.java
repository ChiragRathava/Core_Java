package ex_25_Generics;

public class Lab_218_G {
    public static void main(String[] args) {
        temp_sum(23,45);
        temp_sum("Chirag","Rathava");
    }

    static Integer temp_sum(Integer a, Integer b){
        return a + b;
    }
    static String temp_sum(String a, String b){
        return a + b;
    }
}

