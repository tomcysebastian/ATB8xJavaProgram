package Sept.ex_20092024;

import java.util.Scanner;

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

public class Task13 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter side1 of triangle");
       int side1=sc.nextInt();
        System.out.println("Enter side2 of triangle");
        int side2=sc.nextInt();
        System.out.println("Enter side3 of triangle");
        int side3=sc.nextInt();

        if(side1>=1 && side2>=1 && side3>=1)
        {
            if(side1==side2 && side1==side3 && side2==side3)
                System.out.println("all sides are equal-equilateral");
            else if (side1==side2||side1==side3||side2==side3) {
                System.out.println("exactly two sides are equal-isosceles");
            }
            else {
                System.out.println("scalene");
            }

        }
        else {
            System.out.println("Entered number is negative");
        }


    }
}
