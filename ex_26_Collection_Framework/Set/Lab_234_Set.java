package ex_26_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_234_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Chirag");
        hs.add("Rathva");
        hs.add("Rathva");
        hs.add("VGEC");

        System.out.println(hs);
    }
}
