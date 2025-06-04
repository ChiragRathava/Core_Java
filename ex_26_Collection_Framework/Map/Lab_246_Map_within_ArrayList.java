package ex_26_Collection_Framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab_246_Map_within_ArrayList {
    public static void main(String[] args) {

        Map<String, String> student1 = new HashMap();
        student1.put("name","Chirag");
        student1.put("phone","9784651230");
        student1.put("address","Baroda");
        System.out.println(student1);

        Map<String, String> student2 = new HashMap();
        student2.put("name","Paresh");
        student2.put("phone","1236547890");
        student2.put("address","AmitNagar");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }
}
