package ex_09_Switch;

public class Lab_92_Iterview {
    public static void main(String[] args) {
        char ch = 'A'; //65 // valid
        switch (ch){
            case 65:
                System.out.println("A");
        }

//        boolean b = true; // invalid
//        switch (b){
//        }

        long a1 = 30l; // valid
        switch ((int) a1){
        }

        int a2 = 98;
        switch (a2){
            case 98:
                System.out.println("98");
                // Same case are not valid
//            case 98:
//                System.out.println("98");
        }
    }
}
