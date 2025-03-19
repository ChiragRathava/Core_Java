package ex_05_TypeCasting;

/*
* Type casting
* It is the process of converting value from one data type to anothe.
* types:
* 1. Widening(implicit) also know as implicit casting
*   occurs when converting a smaller data type to a larger one.
*   This type of casting is performed automatically by the java compiler & is considered safe because there's no risk of data loss.
*
* 2. Narrowing(explicit)
*
* */
public class Lab_57 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // valid -> Impict Casting - Automaticaly
        int c = (int)b; // valid -> Explicit Casting - Automaticaly


    }
}
