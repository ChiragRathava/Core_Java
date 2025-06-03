package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_227_ArrayList {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(94);
        marks.add(35);
        marks.add(57);
        marks.add(64);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
