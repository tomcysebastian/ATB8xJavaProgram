package Sept.ex_27092024;

//Give me example of while vs do while loop.
public class Task23 {
    public static void main(String[] args)
    {
        int i=1;
        while (i<1)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("while loop=>1 is not less than 1 , its equal to 1");

        do
        {
            System.out.println("do while loop, value is =>"+i);
            i++;
        }while(i<1);

    }
}
