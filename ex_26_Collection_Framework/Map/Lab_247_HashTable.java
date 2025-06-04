package ex_26_Collection_Framework.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_247_HashTable {
    public static void main(String[] args) {
        // Map -> Key, Value , null value allows
        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one

        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
//        ht1.put(null,"Four");
//        ht1.put(5,null);
        System.out.println(ht1);

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
