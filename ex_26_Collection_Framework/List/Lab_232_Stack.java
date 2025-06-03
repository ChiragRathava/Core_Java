package ex_26_Collection_Framework.List;

import java.util.Stack;

public class Lab_232_Stack {
    public static void main(String[] args) {
        // First In Last Out

        Stack s = new Stack();

        s.add("Chirag");
        s.add("Rathava");
        System.out.println(s);

        s.push("VGEC");
        s.push("CE");
        s.push("GTU");

        System.out.println(s);
        System.out.println(s.size());

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.empty());

        System.out.println(s.add("127"));
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
