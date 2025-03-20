package ex_06_Ternary_Operator;

/*
* also known as Condition operatore.
* evaluate a condition and return one or two values based on the result.
* very similar to - if-else statement.
* syntax : result = condition ? expression1 : expression2;
*   condition : This is boolean expression that is evaluated.
*   expression1 : This expression is executed if the condition is true.
*   expression2 : This expression is executed if the condition is false.
 */
public class Lab_61_TO {
    public static void main(String[] args) {
        //result = condition ? expression1 ? expression2;
        int age1 = 18;
        String canIVote1 = age1 > 18 ? "Yes, You can vote" : "No, You can't vote";

        int age2 = 20;
        String canIVote2 = age2 > 18 ? "Yes, You can vote" : "No, You can't vote";
    }
}