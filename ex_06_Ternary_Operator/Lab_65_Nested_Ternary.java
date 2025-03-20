package ex_06_Ternary_Operator;

/*
* Nester Ternary
* Syntax : result = condition1 ? expression1 : (condition2 ? expression2 : expression3); */
public class Lab_65_Nested_Ternary {
    public static void main(String[] args) {

        int num = 15;
        String result = (num > 10) ? (num > 20 ? "G > 20" : "B 10 to 20") : "B";
        System.out.println(result);
        // (num > 20 ? "G > 20" : "B 10 to 20") -> B 10 to 20
        //

    }
}
