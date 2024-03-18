package MethodsORFunctions;
import java.util.Scanner;
public class PrimeNumber {
    public static boolean IsPrime(int num){
        if(num<=0){
            return false;
        }
        for(int i =2;i<=Math.sqrt(num);i++){
           if(num%i==0){
               return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(IsPrime(num)){
            System.out.println("Number is Prime.");
        }
        else
            System.out.println("Not a Prime Number.");
    }
}
