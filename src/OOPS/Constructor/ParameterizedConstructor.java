package OOPS.Constructor;

class Student2{
    String name;
    int age;
    Student2(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student2 st2 = new Student2("Jitendra",26);
        System.out.println(st2.name+" "+st2.age);
    }
}
