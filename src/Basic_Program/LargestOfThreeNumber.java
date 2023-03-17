package Basic_Program;

import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2=sc.nextInt();
        System.out.println("Enter Third Number :");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Largest number Is : "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Largest Number Is : "+num2);
        }
        else {
            System.out.println("Largest Number Is : "+num3);
        }
    }
}
