package ImpKeywords.Superkeyword;

//super can be used to invoke parent class method
class  Animal1{
    void show(){
        System.out.println("This is Animal class");
    }
}
class Dog1 extends Animal1{
    void show(){
        System.out.println("This is Dog Class");
    }
    void Display(){
        System.out.println("This is Display method inside Dog class");
         show(); // calling method of same class
         super.show(); //super keyword invoking parent class method
    }
}

public class Super2 {
    public static void main(String[] args) {
        Dog1 d =new Dog1(); //create Dog class object
        d.Display();//calling Display method of Dog class
    }
}
