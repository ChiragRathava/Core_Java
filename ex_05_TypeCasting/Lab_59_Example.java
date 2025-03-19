package ex_05_TypeCasting;

public class Lab_59_Example {
    public static void main(String[] args) {
        long phone_no = 1236547890l;
//        short s1 = phone_no; // impicit ? -> No
        short s2 = (short) phone_no; // Explicit ? -> yes
    }
}
