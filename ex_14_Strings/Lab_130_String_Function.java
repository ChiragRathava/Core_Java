package ex_14_Strings;

public class Lab_130_String_Function {
    public static void main(String[] args) {
        String anotherPalidrome = "Niagara, 0 roar again!";
        String roar = anotherPalidrome.substring(11,15);
        System.out.println(roar);

        String s1 = "Chirag";
        String s2 = s1.concat("Rathava");
        System.out.println(s2);
    }
}
