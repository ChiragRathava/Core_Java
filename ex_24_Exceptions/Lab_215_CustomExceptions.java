package ex_24_Exceptions;

public class Lab_215_CustomExceptions {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);

        int result = sbi.add(icici);
        System.out.println(result);

        Bank jp_chase = new Bank("USD",101);
        int result1 = sbi.add(jp_chase);
        System.out.println(result1);
    }
}
