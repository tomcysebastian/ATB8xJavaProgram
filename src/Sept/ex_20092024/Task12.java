package Sept.ex_20092024;

import java.util.Scanner;
//Ternary Operators to handle multiple conditions.
// Input → int score = 85

// String grade →

//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C

public class Task12 {
    public static void main(String[] args)
    {
        int score;
        System.out.println("Enter score between 70 to 100");
        Scanner sc=new Scanner(System.in);
        score=sc.nextInt();
        String grade = score>=90?"A":(score>=80?"B":(score>=70?"C":"D"));
        System.out.println("Grade is "+ grade);

    }
}
