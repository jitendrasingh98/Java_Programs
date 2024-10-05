package OOPS.Constructor;
class Student{
    String name;
    int age;
}

 public class DefaultConstructor {
     public static void main(String[] args) {
         Student student = new Student();
         System.out.println(student.name+" "+student.age);
     }
}
