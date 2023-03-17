package Basic_Program;
import java.util.Scanner;
public class FindFactorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Value : ");
        int num =scan.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial Of "+num+" is "+fact);
    }
}
