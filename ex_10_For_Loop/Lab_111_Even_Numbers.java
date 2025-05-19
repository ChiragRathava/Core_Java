package ex_10_For_Loop;

public class Lab_111_Even_Numbers {
    public static void main(String[] args) {
        for(int i = 0; i < 50; ++i) {
            if (i % 2 == 0) {
                System.out.println("even -> " + i);
            } else {
                System.out.println(i);
            }
        }

    }
}
