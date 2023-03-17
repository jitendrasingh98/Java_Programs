package Basic_Program;
import java.util.Scanner;
public class SwappingWithoutVariables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2=sc.nextInt();
        System.out.println("Before Swapping : "+num1+" "+num2);//10 20/ 50 20
        num1=num1+num2;//10+20=30/ 50+20=70
        num2=num1-num2;//30-20=10/ 70-20=50
        num1=num1-num2;//30-10=20/ 70-50=20
        System.out.println("After Swapping : "+num1+" "+num2);//20 10/ 20 50

    }
}
