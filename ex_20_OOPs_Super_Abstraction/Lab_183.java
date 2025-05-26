package ex_20_OOPs_Super_Abstraction;

public class Lab_183 {
    public static void main(String[] args) {
        Rathava r1 = new Rathava();

        Chirag r = new Rathava();
        // Dynamic Dispatch will Interface
        r.display();
        System.out.println(r.a);

        r1.display();
    }
}

class Rathava implements Chirag{

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Chirag{
    int a = 10;
    void display();
}
