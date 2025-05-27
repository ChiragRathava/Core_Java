package ex_21_Static;

public class Lab_185_Static_P2 {

    public static void main(String[] args) {
        ATB Chirag = new ATB(1236547892,"Chirag");
        ATB Paresh = new ATB(1236547548,"Paresh");

        System.out.println(Chirag.phone_np);
        System.out.println(Paresh.name);

        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);

        Chirag.display();
        Paresh.display();

        ATB.m1();

        // Primitive Variable java is not 100% OOps - int, byte, short, long, float
        // Object ->

    }
}

class ATB{
    static String course_name = "ATB";
    int phone_np;
    String name ;

    public ATB(int phone_np, String name){
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void m1(){
        System.out.println("Mark Attendanc");
    }
}