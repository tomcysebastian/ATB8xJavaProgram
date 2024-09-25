package Sept.ex_25092024;

//Prime numbers are natural numbers that are divisible by only 1 and the number itself.
//Prime Number from 1 to 100. (for loop)

public class Task21 {

    public static void main(String[] args)
    {

        for(int i=2;i<=100;i++)
        {
            int count=0;
          for(int num=i;num>=1;num--)
          {

              if(i%num==0)
              {
                  count++;
              }
          }
            if(count==2) {
                System.out.println(i);
            }
        }

        }
    }

