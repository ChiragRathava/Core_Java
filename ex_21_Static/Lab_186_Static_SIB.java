package ex_21_Static;

public class Lab_186_Static_SIB {
    public static void main(String[] args) {
        A a = new A();

    }
}

class A {
    static {
        System.out.println("Called only Once when is loaded.");
        System.out.println("You can write a code reading a excel file, database file");
    }
    static int a = 10;
    static void m1(){
        System.out.println("static function");
    }
//    static class B{
//        // Not Useful
//    }
}