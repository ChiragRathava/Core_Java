package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_233_ArrayList_Class_element {
    public static void main(String[] args) {
        Student s1 = new Student("rathava","1");
        Student s2 = new Student("chirag","2");
        Student s3 = new Student("vgec","3");

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
