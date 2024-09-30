package Sept.ex_30092024;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        System.out.println("Enter number for which factorial should be found");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("factorial of "+n+ " is "+fact);

    }
    public static int factorial(int n)
    {
        int fact=1,i;
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
       return fact;
    }
}
