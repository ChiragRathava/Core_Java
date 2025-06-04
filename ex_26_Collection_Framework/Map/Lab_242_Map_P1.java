package ex_26_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_242_Map_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(null,"Chirag");
        m1.put(null,"Rathava");
        m1.put("name","Rathava");
        System.out.println(m1);
    }
}
