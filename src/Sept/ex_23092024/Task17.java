package Sept.ex_23092024;

import java.util.Scanner;

//Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
//Input  - 12
//Out - Dec.

public class Task17 {
    public static void main(String[] args)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose any number from 1 to 12, to display the corresponding Month");
        x=sc.nextInt();
        switch (x)
        {
            case 1 :System.out.println("January");
                break;
            case 2 :System.out.println("February");
                break;
            case 3 :System.out.println("March");
                break;
            case 4 :System.out.println("April");
                break;
            case 5:System.out.println("May");
                break;
            case 6:System.out.println("June");
                break;
            case 7:System.out.println("July");
                break;
            case 8:System.out.println("August");
                break;
            case 9:System.out.println("September");
                break;
            case 10:System.out.println("October");
                break;
            case 11:System.out.println("November");
                break;
            case 12:System.out.println("December");
                break;
            default :System.out.println("default option");
                break;


        }


    }
}
