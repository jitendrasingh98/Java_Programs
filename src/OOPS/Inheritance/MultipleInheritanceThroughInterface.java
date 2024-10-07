package OOPS.Inheritance;

// Define the first interface
interface CanFly {
    void fly();
}

// Define the second interface
interface CanSwim {
    void swim();
}

// Class that implements both interfaces
class Duck implements CanFly, CanSwim {
    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }
}

public class MultipleInheritanceThroughInterface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
