package Recursion;
import  java.util.Scanner;
public class PowerOfNumber {
    static int power(int num){
        //base case
        if(num==0){
            return 1;
        }
        else {
            //recursive relation
            return 2*power(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scan.nextInt();
        int result =  power(num);
        System.out.println("Power Of "+num+" is : "+result);
    }
}
