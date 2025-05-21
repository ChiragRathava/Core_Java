package ex_13_Functions;

import java.util.Scanner;

public class Lab_123_User_Defined_In_One {
    public static void main(String[] args) {

        //1. Without Argument / Parameters and Without Return Type.
        greet();

        //2. Without Parameters but With Return Type
        String s = green_with_hello();
        System.out.println(s);

        int age_to_vote_person = age_to_vote();
        System.out.println("Age to vote is " + age_to_vote_person);

        //3. With Parameters and Without Return Type (90%)
        greet_with_name("Chirag");
        greet_with_name("Rathava");

        greet_with_full_name("Chirag","Rathava");

//        greet_with_details("Chirag_29", 23, 9999);
//        greet_with_details("Paresh",30,9000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        greet_with_details(name,age,salary);

        //4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_two_numbers(190,900);
        System.out.println(sum);
        System.out.println(sum2);

        int sum3 = sum_of_three_numbers(2345,5432,5432);
        System.out.println(sum3);
    }

    //1. Without Argument / Parameters and Without Return Type
    static void greet(){
        System.out.println("Hi,I am Without Argument / Parameters and Without Return Type. ");
    }


    //2. Without Parameters but With Return Type
    static String green_with_hello(){
        return "Hi, How are you, example 2 ";
    }

    static int age_to_vote(){
        System.out.println("Calculating age..");
        return 18;
    }


    //3. With Parameters and Without Return Type (void)
    static void greet_with_name(String name){
        System.out.println("Hi, Your name is " +name);
    }

    static void greet_with_full_name(String firstname, String lastname){
        System.out.println("Hi, Your name is " + firstname + lastname );
    }

    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is -> " + name + "\nYour age is -> "  + age + "\nYour salary is -> " + salary);
    }


    //4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a,int b, int c){
        return a+b+c;
    }

}
