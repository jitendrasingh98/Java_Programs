package Basic_Program;
import java.util.Scanner;
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number : ");//50
        int num1=scan.nextInt();
        System.out.println("Enter Second Number : ");//30
        int num2=scan.nextInt();
        int minValue = Math.min(num1,num2);//find the minimum value of num1 and num2
        while (minValue>0){
            if(num1%minValue==0 && num2%minValue==0){
                break;
            }
            minValue--;
        }
        System.out.println("GCD Of  Both Two Numbers "+num1+" and "+num2+ " is "+minValue);
    }
}
