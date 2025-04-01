package ex_08_If_Condition;
//video 25-jan
// 43:00 min

import java.util.Scanner;

// Grade Calculator
public class Lab_85_HackerRank_Edgecase {
    public static void main(String[] args) {
        // step 1
        // Find input / outout
        // Input | score -> (0 - 100) | data type -> int
        // Output | grade -> data type -> char

        // step 2
        // if (score >=90 && score <100 -> return or print grade - A)
        // else if (score <=89 && score >=80 -> return or print grade - B)
        // else if (score <=79 && score >=70 -> return or print grade - C)
        // else if (score <=69 && score >=50 -> return or print grade - D)
        // else grade - F

        // step 3
        // write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = sc.nextInt();
        char grade = 'F';// default value of local variable is a good practice

        if (score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >=80 && score <= 89){
            grade = 'B';
        } else if (score >=70 && score <= 79){
            grade = 'C';
        } else if (score >=60 && score <= 69){
            grade = 'D';
        }
//        else if (score < 0 && score >= 100){
        else if (score < 0 || score >= 100) {
        System.out.println("You are a God.");
            grade = 'O';
        }
        else {
            grade = 'F';
        }
        System.out.println("Your Grade is -> " + grade);

        // step 4 edge cases
    }
}
