package Recursion;
import java.util.Scanner;
public class PrintNaturalNumber {
    static void   natural(int num ) {
        //base case
        if (num == 1) {
         System.out.print(num + " ");
            return ;
        }
        else {
            //recursive relation
           natural(num - 1);
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scan.nextInt();
        System.out.println("first "+num+" natural Number :");
        natural(num);
    }
}
