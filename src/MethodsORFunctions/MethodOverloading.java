package MethodsORFunctions;

// Method Overloading -> Multiple Methods can same name with different Parameters.

public class MethodOverloading {
    public static void main(String[] args) {
       int ans = sum(25,52);
       float ans1= sum(25.023f,52.655f);
        System.out.println("Addition : "+ans);
        System.out.println("Addition :"+ans1);
    }
    static int sum(int a,int b){
        int sum =a+b;
        return sum;
    }
    static float sum( float a,float b){
        float sum =a+b;
        return sum;

    }
}
