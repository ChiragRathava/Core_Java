package ex_20_OOPs_Super_Abstraction;

public class Lab_176_Private {
}

class XYZ{

//    XYZ(){}
// By default empty constructer allways created

//    private int my_gold = 10;
    public int my_gold = 10;
}

class CAB extends XYZ {
    void display(){

//        System.out.println(super.my_gold);
        // Because of private
        // It is not allow

        System.out.println(super.my_gold);
        // Allow because of public
    }
}