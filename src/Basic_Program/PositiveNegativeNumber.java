package Basic_Program;
import java.util.Scanner;
public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num=sc.nextInt();
        if(num>=0)
            System.out.println("Number Is Positive.");
        else
            System.out.println("Number Is Negative.");
    }
}
