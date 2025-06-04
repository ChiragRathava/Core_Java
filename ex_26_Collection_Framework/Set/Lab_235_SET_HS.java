package ex_26_Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab_235_SET_HS {
    public static void main(String[] args) {

        Set hs = new HashSet();
        // Hashing mechanism to store the elemnt, no order
        // no duplicates

        hs.add("Chirag");
        hs.add("Rathva");
        hs.add("Rathva");
        hs.add("VGEC");
        hs.add(null);
        hs.add(29);

        System.out.println(hs);

    }
}
