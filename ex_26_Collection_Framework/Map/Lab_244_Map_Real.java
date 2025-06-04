package ex_26_Collection_Framework.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab_244_Map_Real {
    public static void main(String[] args) {

        Map<String, Object> student1 = new HashMap();
        student1.put("name","Chirag");
        student1.put("phone","9784651230");
        student1.put("address","Baroda");
        System.out.println(student1);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor dad");
        book_read_items.add("Secret");
        book_read_items.add("Atomic");
        book_read_items.add("Eat");
        System.out.println(book_read_items);

    }
}
