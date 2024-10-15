package ImpKeywords.Superkeyword;

class Person{
    int id;
    String name;
    //Parametrized Constructor
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Person{
    float salary;
    //Parametrized constructor
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){System.out.println(id+" | "+name+" | "+salary);}
}
public class SuperDemo {
    public static void main(String[] args) {
        Emp obj = new Emp(1,"Jitendra",50000);//create emp class object
        obj.display();
    }
}
