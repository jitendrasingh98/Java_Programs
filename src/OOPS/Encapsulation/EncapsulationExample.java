package OOPS.Encapsulation;

class Person{
   private String name;
   private int age;

   //setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getters

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        //set value for p1
        p1.setName("Abhay");
        p1.setAge(23);

        //set value for p2
        p2.setName("Jitu");
        p2.setAge(26);

        System.out.println("Person 1 : Name : "+p1.getName()+", Age : "+p1.getAge());
        System.out.println("Person 2 : Name : "+p2.getName()+", Age : "+p2.getAge());
    }

}
