package ex_26_Collection_Framework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab_240_Map_LHS {
    public static void main(String[] args) {
        Map m1 = new LinkedHashMap();

        m1.put("name","Chirag");
        m1.put("rollno", "127");
        m1.put("college", "VGEC");

        System.out.println(m1);
    }
}
