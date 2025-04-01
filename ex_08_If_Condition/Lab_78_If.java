package ex_08_If_Condition;

public class Lab_78_If {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        System.out.println(age);

        if (age > 18){
            System.out.println("You can vote");
        }
    }
}
