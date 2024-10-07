package OOPS.Inheritance;

//parent class know as super class
class A{
    void show(){
        System.out.println("This is parent class.");
    }
}

// child class know as subclass
class B extends A{
    void display(){
        System.out.println("This is child class.");
    }
}

//grand child class - subclass of child class
class C extends B{
    void print(){
        System.out.println("This is grand child class");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.show();//accessing super class method
        c.display();//accessing method of parent class of C
        c.print();
    }

}
