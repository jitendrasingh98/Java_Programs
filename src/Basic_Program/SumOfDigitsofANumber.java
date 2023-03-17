package Basic_Program;
import java.util.Scanner;
public class SumOfDigitsofANumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=scan.nextInt();
        System.out.println("number is : "+num);
        int rem;
        int sum=0;
        int temp=num;
        while (num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum OF Digits Of "+temp+" is : "+sum);
    }
}
