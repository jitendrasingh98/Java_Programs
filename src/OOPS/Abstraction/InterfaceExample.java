package OOPS.Abstraction;

interface Print{
    abstract void print();
}
class Display implements Print{
    public void print(){
        System.out.println("This is print class implements print interface.");
    }
}
public class InterfaceExample  {
    public static void main(String[] args) {
        //we cant create object of an interface

        Display obj = new Display();
       obj.print();
    }
}
