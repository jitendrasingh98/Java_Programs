package OOPS.Inheritance;

//parents class
class Parent {

    // parent class method
    void show() {
        System.out.println("This is Parent Class.");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("This is child class");
    }
}
    public class SimpleInheritance  {
        public static void main(String[] args) {
            //create object of child class
            Child child = new Child();
            child.show();//calling parent method
            child.display();

        }
    }


