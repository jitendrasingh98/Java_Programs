package Basic_Program;
import java.util.Scanner;
public class CalculatorUsingIfElsee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Valie : ");
        int val1= scan.nextInt();
        System.out.println("Entder the second Value : ");
        int val2 = scan.nextInt();
        System.out.println("Press + for Addition.");
        System.out.println("Press - for Subtraction.");
        System.out.println("Press * for Multiplication.");
        System.out.println("Press / for Division.");
        System.out.println("Enter Choise... ");
        char choise=scan.next().trim().charAt(0);//take operator as input
        if (choise=='+'){
            int sum=val1+val2;
            System.out.print("Addition : "+sum);
        }
        else if (choise=='-') {
            int sub=val1-val2;
            System.out.print("Subtraction : "+sub);
        }
        else if (choise=='*') {
            int mul = val1*val2;
            System.out.print("Multiplication : "+mul);
        }
        else if(choise=='/'){
            if(val2!=0){
                double div =val1/val2;
                System.out.print("Division : "+div);
            }
            else
                System.out.println("Division Not Possible.");
        }
        else
            System.out.println("Invalid Operation.");
    }
}
