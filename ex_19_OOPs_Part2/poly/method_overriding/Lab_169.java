package ex_19_OOPs_Part2.poly.method_overriding;

public class Lab_169 {
    public static void main(String[] args) {
        Chirag c = new Chirag();
        c.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Chirag(); // Dynamic Dispatch
        f2.home();// method overriding -

    }

}
