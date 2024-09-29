package Sept.ex_27092024;
// Create a Java program that prints the first 5 even numbers using a do-while loop.
public class Task24 {
    public static void main(String[] args)
    {
       int i=1,count=1;
       do
       {
           if(i%2==0) {
               System.out.println(i);
               count++;
           }
           i++;
       }while(count<=5);

    }
}
