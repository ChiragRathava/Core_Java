package ex_24_Exceptions;
 // if we do not know which type of exception then we use Exception.
public class Lab_204 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/c;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
