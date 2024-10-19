package Trial;

public class newMain {
    public static void main(String[] args) {
        Human Ref1=new Human();
        Human Ref2=new Human("Tomcy");
        Human Ref3=new Human("Sebastian");

        System.out.println(Ref2.country);
        System.out.println(Ref3.country);
        System.out.println(Ref2.Name); //getting the name value dynamically instead of a static name using the "this" keyword in the class.
        System.out.println(Ref3.Name);

    }
}
