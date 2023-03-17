package Basic_Program;
import java.util.Scanner;
public class SwapWithVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2=sc.nextInt();
        System.out.println("Numbers Before Swapping :"+num1+" "+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Numbers After Swapping :"+num1+" "+num2);
    }
}
