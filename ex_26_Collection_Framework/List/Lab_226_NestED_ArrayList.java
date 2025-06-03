package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_226_NestED_ArrayList {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("Chirag");
        l.add(29);
        l.add(true);
        System.out.println(l);

        List<Integer> l_1 = new ArrayList();
//        l_1.add("chirag"); // Not possible
        l_1.add(2003);
        System.out.println(l_1);

        List<String> l_2 = new ArrayList();
        l_2.add("Rathava");
//        l_2.add(12); // Not possible
        l_2.add("Chirag");
        System.out.println(l_2);

        List all_list = new ArrayList();
        all_list.add(l);
        all_list.add(l_1);
        all_list.add(l_2);
        System.out.println(all_list);
        System.out.println(all_list.get(1));

    }
}
