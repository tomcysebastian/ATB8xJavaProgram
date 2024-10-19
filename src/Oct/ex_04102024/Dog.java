package Oct.ex_04102024;

public class Dog {
    String name,breed;
    int legs,age;

    Dog(){//Default constructor=DC
        System.out.println("Breed is gs");

    }
    Dog(String name,String breed,int legs,int age){//parameterized constructor-PC
        this.name=name;
        this.age=age;
        this.breed=breed;
        this.legs=legs;
        System.out.println("name: "+name+" age: "+age+" breed: "+"legs: "+legs);

    }

}
