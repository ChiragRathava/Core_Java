package ex_15_Strings_Functions;

public class Lab_133_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Chirag");
        sb.append("Rathava");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder("Chirag");
        stringBuilder.append("Rathava");
        System.out.println(stringBuilder);

        stringBuilder.append("Hi!");
        System.out.println(stringBuilder);
    }
}
