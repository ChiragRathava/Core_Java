package ex_26_Collection_Framework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab_236_SET_LHS {
    public static void main(String[] args) {

        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element
        // order will maintain, no duplicate
        lhs.add("Chirag");
        lhs.add("Rathva");
        lhs.add("Rathva");
        lhs.add("VGEC");
        lhs.add(null);
        lhs.add(29);

        System.out.println(lhs);

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains(null));
        System.out.println(lhs.size());

    }
}
