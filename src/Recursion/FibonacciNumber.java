package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    static int fabonacci(int nterm){
       //base case
        if (nterm==0){
           return 0;
       }
       else if (nterm==1) {
           return 1;
       }
       else {
           //recursive relation
          return fabonacci(nterm-1)+fabonacci(nterm-2);
       }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number of term : ");
        int nterm= scan.nextInt();
        int ans = fabonacci(nterm);
        System.out.println("total of "+nterm+"th term : "+ans);

    }
}
