package ex_17_OOPs;

public class Lab_156_Cats {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2 = null;
        new Cat();

        c1.runnig();
        c2.runnig(); //.NullPointerException
    }
}

class Cat{
    String name;

    void runnig(){
        System.out.println("Running");
    }
}
