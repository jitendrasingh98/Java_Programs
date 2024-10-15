package ImpKeywords.Superkeyword;

// super is used to refer immediate parent class instance variable

class Animal{
    String name ="Animal Class";
}
class Dog extends Animal{
    String name="Dog class";
    void DisplayName(){
        System.out.println(name);
        System.out.println(super.name);//super keyword refer parent class variable
    }
}
public class Super1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.DisplayName();///call method
    }
}
