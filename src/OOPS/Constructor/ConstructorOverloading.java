package OOPS.Constructor;

class Students{
    String name;
    int age;

    //No-Args Constructor
    Students(){
        this.name="Jitendra";
        this.age=26;
    }

    //Constructor with one Parameter
    Students(String name){
        this.name=name;
        //this.age=0//default value
    }

    //Constructor with two Parameter
    Students(String name,int age){
        this.name=name;
        this.age=age;
    }

    //Method To Display Student Details
    public void Display(){
        System.out.println("Name : "+name);
        System.out.println("Age :"+age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Students students1 = new Students();//invokes no args constructor
        Students students2 = new Students("Abhay");//invokes parameterized constructor with one parameter
        Students students3 = new Students("Saurabh",24);//invokes parameterized constructor with two parameter

        //Print Students Details
        System.out.println("Student 1 Details : ");
        students1.Display();
        System.out.println();

        System.out.println("Students 2 Details : ");
        students2.Display();
        System.out.println();

        System.out.println("Students 3 Details : ");
        students3.Display();

    }
}
