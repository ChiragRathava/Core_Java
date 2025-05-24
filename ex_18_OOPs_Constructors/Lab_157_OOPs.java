package ex_18_OOPs_Constructors;

public class Lab_157_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby be;
    }
}

class Baby{
    String name;

    // Default Constructor also called
    Baby(){
        System.out.println("I am called, Object is created!");
    }

    // Instance initialization block
    {
//        System.out.println("I am also called, when Class is loaded.");
        System.out.println("Step-1 Called Database before working!!");
    }
}
