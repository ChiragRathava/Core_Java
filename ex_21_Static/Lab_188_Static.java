package ex_21_Static;

public class Lab_188_Static {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);

        Automation.driver = "Firefox";
        System.out.println(Automation.driver);
    }
}

class Automation{
    static String driver = "chrome";
}
