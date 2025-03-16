package ex_02_JavaBasic;

public class Lab_26_Local_Variable {
    public static void main(String[] args) {
        int a = 10;
        // local veriable means only valid in a this main function .
        // within {}
        byte b = 10;
        short c = 20;
        long d = 1236547890l;
        float e = 3.14f;
        double f = 65.2665656;
        boolean g = true;
        char h = 'c';
//        char i = "c"; // not posible -> ""

        /*
        * Rule : Default value of the Local Variable is not assigned by the JVM.(Error)
        *
        * Rule need to remember - Local Variables
        * Defaualt value of char is not space. 0
        * Defaualt - byte -> 0
        * Local variable must be initialiesd before using.
        * You can declare multiple variables of same data types in a single statement.
        * We can't use const keyword to declare cosntant.
        * Value of the final variable can not be changed.
        * Value of the varible can be change any number of times during program execution.*/
        System.out.println(a);
    }
}
