package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_223_List {
    public static void main(String[] args) {

        List myList = new ArrayList(5);
        List l = new ArrayList();

        List mylist2 = new LinkedList(); // Double Linked List
        mylist2.add("Chirag");
        mylist2.add("Rathava");
        System.out.println(mylist2);
        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Chirag"));
        System.out.println(mylist2.indexOf("Chirag"));
    }
}
