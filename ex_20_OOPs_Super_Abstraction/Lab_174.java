package ex_20_OOPs_Super_Abstraction;

public class Lab_174 {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}

// Single Inheritance
class Car extends Vehicle {
    private int maxSpeed = 281;

    Car(){
        super(100);

    }

    void test(){}

    Car(int a){
        System.out.println("PC Car");
    }

    void display(){
        System.out.println("Overide - Car");
        System.out.println(super.maxSpeed); //180 - Parent Max
        System.out.println(this.maxSpeed);

        super.notest();
        this.test();
    }
}
class Vehicle{
    public int maxSpeed = 180;

    void notest(){}

    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a){
        System.out.println("Parameter Con");
    }

    //Method Overloading - same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - argument");
    }

    void display(){
        System.out.println("Vehicle parent");
    }
}