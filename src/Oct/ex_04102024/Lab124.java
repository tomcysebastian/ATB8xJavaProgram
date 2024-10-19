package Oct.ex_04102024;

public class Lab124 {
    public static void main(String[] args) {
        AHuman amit=new AHuman(); //default constructor will be invoked
        AHuman pramod=new AHuman("Pramod");
        AHuman Vijay=new AHuman("Vijay");//parameterized constructor will be invoked
        new AHuman();//by default it will run -> default constructor;
        System.out.println(amit.Name);
        System.out.println(pramod.Name);
        System.out.println(Vijay.Name);
        System.out.println(amit.country);
        System.out.println(pramod.country);

        //2 References [amit, pramod]
        //3 object is created

    }
}
