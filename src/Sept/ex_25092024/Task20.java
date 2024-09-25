package Sept.ex_25092024;
//Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
// n = 1 ->  Fact = 1*1 -> 1
// n = 3 -> Fact = 3*2*1 -> 6

public class Task20 {

    public static void main(String[] args)
    {

        int no=5,fact=1;

        //int factorial = 0;
        for(int i=1;i<=no;i++)
        {
           fact=fact*i;
        }
        System.out.println("factorial of 5"+"="+fact);
    }
}
