package ex_20_OOPs_Super_Abstraction;

public class Lab_179_Interface_P1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.drive();
    }
}

class Car1 implements Engine1, Brakes{

    void drive(){
        startEngine();
        applayBreak();
        stopEngine();
    }
    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void applayBreak() {
        System.out.println("Apply Break");
    }
}

interface Engine1{
    void startEngine();
    void stopEngine();

    // in Interface we are not able to create a complete Function.
//    void test(){
//        System.out.println("complete Function");
//    }

    // if you want then you need to implent default
    default void test(){
        System.out.println("complete Function");
    }
}

interface Brakes{
    void applayBreak();

}