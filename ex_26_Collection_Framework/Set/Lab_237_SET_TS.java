package ex_26_Collection_Framework.Set;

import java.util.Set;
import java.util.TreeSet;

public class Lab_237_SET_TS {
    public static void main(String[] args) {
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the elemetny
        // order will maintain, Natural Sorting is done
        ts.add("Rathava");
        ts.add("Chirag");
        ts.add("Rathva");
        ts.add("VGEC");
//        ts.add(null);
//        ts.add(29);

        System.out.println(ts);

        System.out.println(" --For each-- ");

        for(Object o:ts){
            System.out.println(o);
        }

    }
}
