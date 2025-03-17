package ex_03_Literals;

public class Lab_35_Literal_Char {
    public static void main(String[] args) {

        //char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r'; // delete the previous word

        System.out.println("Chirag" + new_line + "Rathava");
        System.out.println("Chirag" + "Rathava");
        System.out.println("Chirag" + tab_line + "Rathava");
        System.out.println("Chirag" + back_space + "Rathava");
        System.out.println("Chirag" + car_r + "Rathava");

        char c11 = '\u1F60';
        // ASCII
        // chines - indea, japense -> Unicode
        // /u09878
        char ruppes = '₹';
        System.out.println("Chirag has "+ ruppes + 10);
    }
}
