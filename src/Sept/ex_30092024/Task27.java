package Sept.ex_30092024;

public class Task27 {
   public static void main(String[] args) {

       prime();

    }
    public static void prime()
    {
        int no,i;
        for( i=2;i<=100;i++)
        {
           int count=0;
           for(no=i;no>=1;no--)
           {
             if(i%no==0)
             {
                 count++;
             }
           }
           if(count==2)
           {
               System.out.println(i);
           }
        }
    }
}
