package ex_24_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_214_Interview {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Yes");
        }
    }
}
