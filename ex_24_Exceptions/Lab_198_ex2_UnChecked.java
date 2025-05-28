package ex_24_Exceptions;

public class Lab_198_ex2_UnChecked {
    public static void main(String[] args) {

        String name = null;
        name.trim(); // ("  chirag   ") -> trailing spaces -> "chirag"
        // java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
    }
}
