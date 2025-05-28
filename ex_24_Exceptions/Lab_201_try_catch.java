package ex_24_Exceptions;

public class Lab_201_try_catch {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10/2;
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("2");

        // only try is executed.
    }
}
