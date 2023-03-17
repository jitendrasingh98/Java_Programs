package MethodsORFunctions;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
       swap();

    }
    public static void swap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 =sc.nextInt();
        System.out.println("Enter second Number : ");
        int num2=sc.nextInt();
        System.out.println("Before Swapping : "+num1+" "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping : "+num1+" "+num2);

    }
}
