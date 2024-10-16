package ImpKeywords.StaticKeyword;

public class Student {
    int rollNo;
    String name;
    static String collegeName="GLA";
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
 void display(){
     System.out.println("ROll No : "+rollNo+", Name : "+name+", College : "+collegeName);
 }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Abhay");
        Student s2 = new Student(2,"Jitendta");
        s1.display();
        s2.display();
    }
}
