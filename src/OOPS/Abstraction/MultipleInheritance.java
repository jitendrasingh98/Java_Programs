package OOPS.Abstraction;

interface One{
   abstract void show();
}
interface Two{
    abstract void print();
}
class Child implements One,Two{
    public void show(){
        System.out.println("This is First Interface");
    }
    public void print(){
        System.out.println("This is Second interface");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.print();
    }
}
