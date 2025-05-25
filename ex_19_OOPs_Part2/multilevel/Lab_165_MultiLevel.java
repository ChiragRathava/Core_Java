package ex_19_OOPs_Part2.multilevel;

public class Lab_165_MultiLevel {
    public static void main(String[] args) {
        Son Chirag = new Son();

        Father f = new Father();

        GrandFather gf = new GrandFather();

        Chirag.home();

//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        // Son Rathava = new Son();

        GrandFather g1 = new Son();
        GrandFather g2 = new Father();

        Father f1 = new Son();
//        Father f2 = new GrandFather();
    }
}
