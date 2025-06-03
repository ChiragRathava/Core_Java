package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_222_ArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("3");
        l.add(4);

        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));
        System.out.println(l.contains(1));
        System.out.println(l.indexOf("3"));
        System.out.println(l.lastIndexOf("3"));

        System.out.println(l);

        System.out.println(" --- ");

        for (int i = 0; i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
