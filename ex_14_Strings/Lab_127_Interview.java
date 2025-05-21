package ex_14_Strings;

public class Lab_127_Interview {
    public static void main(String[] args) {
        String name = "Chirag";
        name.toUpperCase();
        // How many string in a JVM pull
        // ans. 2
        System.out.println(name);

       name = name.toUpperCase();
        System.out.println(name);
    }
}
