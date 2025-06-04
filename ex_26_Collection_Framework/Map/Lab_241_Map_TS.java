package ex_26_Collection_Framework.Map;

import java.util.Map;
import java.util.TreeMap;

public class Lab_241_Map_TS {
    public static void main(String[] args) {
        Map m1 = new TreeMap();

        m1.put("name","Chirag");
        m1.put("rollno", "127");
        m1.put("college", "VGEC");

        System.out.println(m1);
    }
}
