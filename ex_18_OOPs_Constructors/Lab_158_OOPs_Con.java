package ex_18_OOPs_Constructors;

public class Lab_158_OOPs_Con {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1);
        System.out.println(a2);

    }
}

class A {
    A(){
        System.out.println("DC");
    }
}
