package ex_24_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_212_Interview {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
