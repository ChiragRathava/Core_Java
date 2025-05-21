package ex_13_Functions;

// Without Parameters and Without Return Type
public class Lab_122_User_Defined {

    // no argument and no return type

    public static void main(String[] args) { // this main is called by JVM program(runnnig RAM)

        //step 2 - Call the functions
        main();
        greet();
    }

    // step 1 - Declaration / Define
    static void main(){
        System.out.println("Hi, another Look of main");
    }

    static void greet(){
        System.out.println("Hi, How are you?");
    }
}
