package Basic_Program;
import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2=sc.nextInt();
        int sum =num1+num2;
        System.out.println("Additio of "+num1+" and "+num2+" Is : "+sum);
    }
}
