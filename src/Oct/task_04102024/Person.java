package Oct.task_04102024;

public class Person {
    String name,gender,address ,occupation,citizenship,marital_status;
    int age,weight,height,year_of_experience;

    Person(){ //default constructor-DC
        System.out.println("default constructor-DC \n");
        System.out.println("Creating a Person Class with 10 A, 5 Behavr( All types of Methods) and use the DC and PC to set the values, Create 5 Objects. \n");
    }
    Person(String name,String gender,String address,int age,int weight,int height){  //parameterized constructor-PC
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
        this.weight=weight;
        this.height=height;
        System.out.println("name: "+name+", gender: "+gender+", address: "+address+", age: "+age+", weight: "+weight+", height: "+height+"\n");

    }


    public void setOccupation()
    {
        occupation="Software Developer";
        System.out.println("no return type and no parameters \n");
        System.out.println("occupation is :"+occupation+"\n");
    }
    public void setCitizenship(String citizenship){
        this.citizenship=citizenship;
        System.out.println("no return type and with parameters \n");
        System.out.println("citizenship :"+citizenship+"\n");
    }
    public String setMarital_status(String marital_status)
    {
        this.marital_status=marital_status;
        System.out.println("with return type and with parameters \n");
        return marital_status;

    }

    public int setYear_of_experience() {
        year_of_experience=10;
        System.out.println("with return type and no parameters \n");
        return year_of_experience;
    }
}
