package Basic_Program;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num =scan.nextInt();
     //   System.out.println("Original number : "+num);
        int temp=num;
        int rem;
        int sum=0;
        while (num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
       // System.out.println(sum);
        if(temp==sum) {
            System.out.println("Number is Palindrome.");
        }
        else
            System.out.println("Not Palindrome.");
    }
}
