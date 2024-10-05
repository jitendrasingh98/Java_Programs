package OOPS.Constructor;
class Student1{
    String name;
    int age;
    Student1(){
        this.name="Jitendra";
        this.age=26;
    }
}
public class NoAgrsConstructor {
    public static void main(String[] args) {
 Student1 st1 = new Student1();
        System.out.println(st1.name+" "+st1.age);
    }
}
