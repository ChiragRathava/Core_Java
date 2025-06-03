package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_225_ArrayList_95{
        public static void main(String[] args) {

                List l = new ArrayList();
                l.add("bread");
                l.add("milk");
                l.add("panner");
                l.add(123);
                l.add(true);

                System.out.println(l);

                System.out.println(" --- default for loop");
                for (int i = 0; i < l.size(); i++){
                        System.out.println(l.get(i));
                }

                System.out.println(" --- for each loop");
                for (Object o:l){
                        System.out.println(o);
                }

                System.out.println(" - To Print ArrayList Iterator ");

                // Iterator - Anchor - go to one by one forward -> get access them
                // HashNext() -> true - If we have a next element
                // Next() -> element

                Iterator iterator = l.iterator();
                while (iterator.hasNext()){
                        System.out.println(iterator.next());
                }
        }
}
