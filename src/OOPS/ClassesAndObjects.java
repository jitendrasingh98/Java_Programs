package OOPS;
public class ClassesAndObjects{
    public static void main(String[] args) {
        Student std = new Student();//creating object
        System.out.println(std.roolno);
        System.out.println(std.name);
        System.out.println(std.marks);

    }
}
class Student{
    int roolno=1;
    String name="jitendra";
    float marks=85.25f;
}

