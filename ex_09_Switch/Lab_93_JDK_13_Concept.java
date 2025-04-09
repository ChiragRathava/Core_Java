package ex_09_Switch;

public class Lab_93_JDK_13_Concept {
    public static void main(String[] args) {
        //JDK 13

        // We can add multiple condition in 1

        int itemcode = 003;

        switch (itemcode){
            case 001,002,003:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,005,007:
                System.out.println("This is match");
                break;
            default:
                System.out.println("None");
        }
    }
}
