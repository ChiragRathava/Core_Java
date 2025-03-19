package ex_05_TypeCasting;

public class Lab_60_Where_Used {
    public static void main(String[] args) {
        // GST - 18.45
        int course = 100;
        float GST = 18.45f;
        float total = course + GST;
        System.out.println(total);

//        int total1 = course + GST; //Narrow - implicit
        int total1 = course + (int)GST; //Narrow - Explicit //we need to not use this
        System.out.println(total1);

//        float total = course + GST; //Widenning - implicit
        System.out.println(total);

        float total2 = (float) course + GST; //Widenning - Explicit
    }
}
