package Oct.task_04102024;

public class TaskMain {
    public static void main(String[] args) {
       Person p1=new Person();
        Person p2=new Person("Arjun","Male","olive flat-4th building,Delhi",26,69,179);
        Person p3=new Person("Revathy","Female","olive flat-4th building,Tamil Nadu",28,58,168);
        Person p4=new Person();
        Person p5=new Person();

      p4.setOccupation();
      p5.setCitizenship("Indian");
      String status=p1.setMarital_status("married");
      System.out.println("Arjun is "+status+"\n");
      int count=p2.setYear_of_experience();
        System.out.println("Arjun has "+count+" years of experience");


    }
}
