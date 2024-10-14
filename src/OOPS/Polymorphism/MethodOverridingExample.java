package OOPS.Polymorphism;

class Animal{
    void sound(){
        System.out.println("Animal Makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.sound();
        Dog d = new Dog();
        d.sound();
    }
}
