package OOPS.Inheritance;

//parent class - super class
class Animal{
   void show(){
       System.out.println("Super Class");
   }
}

//subclass1
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

//child class2 - subclass2
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        //create method of first child class
        Dog d = new Dog();

        d.show();//accessing parent class method
        d.bark();

        //second subclass object
        Cat c =new Cat();
        c.show();// accessing parent class method
        c.meow();
    }
}
