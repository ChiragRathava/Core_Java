package ex_04_Operators;

public class Lab_49_Interview {
    public static void main(String[] args) {
        int My_salary = 12;
        boolean Ans = !(My_salary > 10 || My_salary < 5);
        System.out.println(Ans);

        /*
        * My_salary > 10 -> true
        * My_salary < 5 -> false
        * true || false -> true
        * !(true) -> false
        */
    }
}
