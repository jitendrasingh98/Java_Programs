package Basic_Program;
import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int val1 = scan.nextInt();
        System.out.println("Enter Second Value : ");
        int val2 = scan.nextInt();
        System.out.println("Press 1 for Addition.");
        System.out.println("Press 2 for subtraction.");
        System.out.println("Press 3 for Multplication.");
        System.out.println("Press 4 for Division.");
        System.out.println("Enter Choise..");
        int choise = scan.nextInt();
        switch (choise){
            case 1:
                int sum=val1+val2;
                System.out.print("Addition : "+sum);
                break;
            case 2:
                int sub=val1-val2;
                System.out.print("Subtraction : "+sub);
                break;
            case 3:
                int mul=val1*val2;
                System.out.print("Multiplication : "+mul);
                break;
            case 4:
                if(val2!=0){
                    int div = val1/val2;
                    System.out.print("Division : "+div);
                    break;
                }
                else {
                    System.out.println("Division Not Possible.");
                }
                break;
            default:
                System.out.println("Invalid Choise.");
        }
    }
}
