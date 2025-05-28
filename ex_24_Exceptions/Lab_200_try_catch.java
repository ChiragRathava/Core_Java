package ex_24_Exceptions;

public class Lab_200_try_catch {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace(); // This means full problem details with line no.

            System.out.println("Own message");
        }
        System.out.println("2");

        // everything is executed.
    }
}
