package Sept.ex_27092024;
//Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
public class Task25 {
    public static void main(String[] args)
    {
        int i=1,sum=0;
       while(i<=100)
       {
           sum=sum+i;
           i++;
       }
        System.out.println("sum of numbers from 1 to 100 => "+sum);

    }
}
