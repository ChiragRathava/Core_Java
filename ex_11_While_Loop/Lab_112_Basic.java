package ex_11_While_Loop;
// it call Entry Controlled Loop
// When you are using for statement then it verifies the condition before executing the block.
/*
* same as for loop
* syntax:
* I
* while(C){//. Block of code we want to execute
* U
* }*/

public class Lab_112_Basic {
    public static void main(String[] args) {
        int i = 0; // I
        while (i < 10){  // C
            System.out.println(i);
            i++; // U
//            break;
        }

        // I,C,U
//        for(int j = 0; j < 10 ; j++){
//            System.out.println(j);
//        }
    }
}
