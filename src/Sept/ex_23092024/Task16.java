package Sept.ex_23092024;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number for calculation");
        int no1=sc.nextInt();
        System.out.println("Enter first number for calculation");
        int no2=sc.nextInt();
        System.out.println("Please specify the calculation based on the number provided 1.addition, 2.subtraction, 3.multiplication, 4. division and 5. modulus based on user input ");
        x=sc.nextInt();
        switch (x)
        {
            case 1 :System.out.println("Addition :"+(no1+no2));
            break;
            case 2 :System.out.println("Subtraction :"+(no1-no2));
                break;
            case 3 :System.out.println("Multiplication :"+(no1*no2));
                break;
            case 4 :System.out.println("Division :"+(no1/no2));
                break;
            case 5:System.out.println("Division :"+(no1%no2));
                break;
            default :System.out.println("The action that mentioned was not in scope");
              break;


        }


    }
}
