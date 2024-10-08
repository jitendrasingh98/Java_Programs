package OOPS.Inheritance;

//parent class - super class
class SingleParent{
   void show(){
       System.out.println("This is super Class for both child class/subclass.");
   }
}

//subclass1
class Child1 extends SingleParent{
    void print(){
        System.out.println("Child1");
    }
}

//child class2 - subclass2
class Child2 extends SingleParent{
    void display(){
        System.out.println("Child2");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        //create method of first child class
        Child1 c1 = new Child1();

        c1.show();//accessing parent class method
        c1.print();

        //second subclass object
        Child2 c2 =new Child2();
        c2.show();// accessing parent class method
        c2.display();
    }
}
