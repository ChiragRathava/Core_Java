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
public class Lab_58_Narrowing {
    public static void main(String[] args) {
        int val = 200;
        byte c = (byte)val; // Valid - Explicit narrowing is not allowed
        // Data loss : because of overflow

//        byte b = val; // Invalid - Implicit narrowing is not allowed


    }
}
