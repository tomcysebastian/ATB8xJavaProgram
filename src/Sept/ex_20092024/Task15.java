package Sept.ex_20092024;
//Leap Year Program

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args)
    {
        int year=2024;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(" leap year");
        else
            System.out.println("Not a leap year");

    }
}



