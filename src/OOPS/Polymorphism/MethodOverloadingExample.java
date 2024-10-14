package OOPS.Polymorphism;

public class MethodOverloadingExample {
    static  int sum(int a, int b){
        return a+b;
    }
    static  int sum(int a, int b,int c){
        return a+b+c;
    }
    static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(7,8,9));
        System.out.println(sum(2.5f,3.6f));
    }
}
