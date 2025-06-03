package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_231_AL_iteration {
    public static void main(String[] args) {

        List<String> l = new ArrayList();
        l.add("Chirag");
        l.add("Rathava");
        l.add("VGEC");

        System.out.println(" - To Print Arraylist - 1");

        for (String str : l){
            System.out.println(str);
        }

        System.out.println(" - To Print Arraylist - 2");

        for (int i=0;i < l.size(); i++){
            System.out.println(l.get(i));
        }

        System.out.println(" - To Print Arraylist - 3");

        //Iterator
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
