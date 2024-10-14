package OOPS.Polymorphism;
//this is the example of compile time polymorphism/function overloading.

class Student1{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}


public class polymorphismExample {
    public static void main(String[] args) {
        Student1 st = new Student1();//create object of Student1 class
        st.name="aman";
        st.age=25;
        st.printInfo(st.name, st.age);

    }
}
