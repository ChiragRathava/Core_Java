package ex_09_Switch;

public class Lab_94_JDK_13_Concept {
    public static void main(String[] args) {
        int itemcode = 001;

        switch (itemcode){

            //Short cut for we can use break without a define
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
