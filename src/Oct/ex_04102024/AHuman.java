package Oct.ex_04102024;

public class AHuman {

        String eye_color;
        long aadhar_no;
        String Name;
       String country="India";

        //Default Constructor-> this has NULL return type
        AHuman()
        {
            System.out.println("I will be called out immediately");
            //I can write a code here which will be automatically called when object is created.
            //In future we can use this to Read a txt file,csv,excel here
        }

        //Parameterized constructor -> this will be automatically executed when object is created [ie;for which obj creation, parameter is passed]
    AHuman(String name)
    {
        this.Name=name;
        System.out.println(this.Name);
        //I can write a code here which will be automatically called when object is created.
        //In future we can use this to Read a txt file,csv,excel here
    }

        void walk()
        {
            System.out.println("No return type , no argument");
        }
        int sleep()
        {
            System.out.println(" return type without argument");
            return 10;
        }
        void talk(String name)
        {
            System.out.println("No return type with argument");
        }
       String run(String color)
        {
            System.out.println("return type with argument");
            return "red";
        }

}
