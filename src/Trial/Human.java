package Trial;

public class Human {

    //String name="Alen" ;-> This will be a global value , to get the value dynamically passed as parameter into the screen ,we should use this keyword
    String Name;
    String address;
    long phone_no;
    String country="India";

    Human(){
        System.out.println("default constructor");
    }
    Human(String name){
        this.Name=name;
    }

}
