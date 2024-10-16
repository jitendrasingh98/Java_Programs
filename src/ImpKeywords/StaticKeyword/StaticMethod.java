package ImpKeywords.StaticKeyword;


//static method within the same class example:
/*
public class StaticMethod {
    //create static method
    static void display(){
        System.out.println("This is static method.");
    }
   static int num;
    public static void main(String[] args) {
    num=25;
    System.out.println(num);
    display();//call directly without creating object of the class
    }
}
*/


//static method with another class
class Demo1{
    static void Display(){
        System.out.println("Static Method.");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Demo1.Display();
    }
}