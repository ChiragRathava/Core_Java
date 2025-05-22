package ex_15_Strings_Functions;

public class Lab_131 {
    public static void main(String[] args) {
        String name = "Chirag";
        System.out.println(name.length());
        //1. charAt()
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); //.StringIndexOutOfBoundsException

        //2. concat() -> add at last
        System.out.println(name.concat("Rathava"));

        //3. contains()
        System.out.println(name.contains("hi"));

        //4. equals()
        System.out.println(name.equals("Chirag"));

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("chirag"));

        //6. indexof()
        System.out.println(name.indexOf('g'));

        String s1 = "madam";
        System.out.println(s1.indexOf("m"));

        //7. length()
        System.out.println(name.length());

        //8. replace()
        System.out.println(name.replace('h','H'));

        //9. split()
        String name_1 = "Rathava Chirag";
        String[] split = name_1.split(" ");
        System.out.println(split[0]);
        System.out.println(split[1]);

        String name_2 = "rathavachirag921@gmail.com";
        String[] split_ = name_2.split("@");
        System.out.println(split_[0]);
//        System.out.println(split_[2]);
        System.out.println(split_[1]);

        System.out.println(" ___");

        //10. substring(,) //Extracts a portion of the string.
        System.out.println(name.substring(1,3));
        String name_3 = "hamburger";
        System.out.println(name_3.substring(4,8));
        System.out.println(name_3.substring(4,9));

        //11. toLowerCase()
        System.out.println("CHIRAG".toLowerCase());

        //12. toUpperCase()
        System.out.println("chirag".toUpperCase());

        //13. startsWith()
        System.out.println(name.startsWith("h"));

        //14. endWith()
        System.out.println(name.endsWith("g"));

        //15. trim()
        String name_4 = "   Chirag Rathava  ";
        System.out.println(name_4.trim());

        //16. compareTo()
        System.out.println(name.compareTo("Chirag"));

        //17. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("Chirag"));

        StringBuilder stringBuilder = new StringBuilder("Chirag");
        stringBuilder.append("Rathava");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());
    }
}
