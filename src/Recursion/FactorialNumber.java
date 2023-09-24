package Recursion;

import java.util.Scanner;
public class FactorialNumber {
    static int factorial(int num){
        //base case
        if(num==1)
            return 1;
        else
            //recursive relation
            return num*factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = scan.nextInt();
        int result = factorial(num);//function call
        System.out.println("Factorial of "+num+" "+"is : "+result);
    }
}
