package ex_07_Increment_Decrement_Op;
/*
* Prefix Increment : ++variable
* Postfix Increment : variable++
* */
public class Lab_69_Pre_ID_Op {
    // pre - increment -> ++Operand.
    // value is incremented first and stored in the result.

    public static void main(String[] args) {

        int a = 10;
        int b = ++a; // a + 1

        System.out.println(b);
        System.out.println(a);

        // Exp and Result Table
        /*
        *  Line No | a | Result b
        *      12  | 10 | NA
        *      13  | 11 | 11
        *      15  | NA | 11
        *      16  | 11 | NA
        * */
    }



}
