package ex_25_Generics;

public class Lab_219 {
    public static void main(String[] args) {
        temp(23,34);
        temp("Chirag","Rathava");
        temp(true,false);
    }
    // T -> can be any data type

    public static <T> T temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}