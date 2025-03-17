package ex_03_Literals;

public class Lab_32_Constant {
    int i_age; // instance variable
    static int s_age; // static variable

    public static void main(String[] args) {



        int age ;
        //local veriable does not get a default value by JVM
        age = 23;
        System.out.println(age);
//        System.out.println(i_age);
        System.out.println(s_age);
    }
}
