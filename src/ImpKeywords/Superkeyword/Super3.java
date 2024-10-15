package ImpKeywords.Superkeyword;

// super is used to invoke parent class constructor.

class Animal2{
    Animal2(){
        System.out.println("Animal class Constructor.");
    }
}
class Dog2 extends Animal2{
   Dog2(){
       super();//optional compiler automatically added super keyword
       System.out.println("Dog class constructor.");
   }
}
public class Super3 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}
