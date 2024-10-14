package OOPS.Abstraction;
 abstract class Vehicle{
    abstract void start();
 }
 class Car extends Vehicle{
     void start(){
         System.out.println("This is Car.");
     }
 }
 class Bike extends Vehicle{
     @Override
     void start() {
         System.out.println("This is bike class.");
     }
 }
public class AbstractClassAndMethod {
    public static void main(String[] args) {
        Car c =new Car();
        c.start();
        Bike b = new Bike();
        b.start();
    }
}
