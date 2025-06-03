package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_221_List {
    public static void main(String[] args) {

//        List l = new List(); // not possible because of it is a interface

        List fruits = List.of("orange","apple","Banana");
        System.out.println(fruits);

//        fruits.add("Chery"); // java.lang.UnsupportedOperationException
//        fruits.remove("apple");// Not possible

        ArrayList a = new ArrayList();
        a.add("Chirag");
        a.add(null);
        a.add("Rathava");
        a.add("Rathava");
        a.add(123);
        System.out.println(a);
        System.out.println(a.size());

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
    }
}
