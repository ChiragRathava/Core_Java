package ex_04_Operators;

public class Lab_43_Interview_Concat_Plus {
    public static void main(String[] args) {
        String First_Name = "Chirag";
        String Last_Name = "Rathava";
        int a = 10;
        int b = 20;

        System.out.println(First_Name + Last_Name + a + b);
        //ChiragRathava1020 -> First operator - performed as Concation

        System.out.println(a + b + First_Name + Last_Name);
        // First + math -> 30ChiragRathava

        System.out.println(First_Name + Last_Name + (a + b));
        // BODMAS - Bracket of Div, mul, add, sub

    }
}
