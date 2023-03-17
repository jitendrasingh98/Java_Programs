package Basic_Program;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");//1234
        int num =scan.nextInt();
        System.out.println("Original number : "+num);
        int rem;
        int sum=0;
        while (num>0){//1234>0=T,123>0=T,12>0=T,1>0=T,0>0=F
            rem=num%10;//1234%10=4,123%10=3,12%10=2,1%10=1,
            sum=sum*10+rem;//0*10+4=4,4*10+3=43,43*10+2=432,432*10+1=4321
            num=num/10;//1234/10=123,123/10=12,12/10=1,1/10=0,
      }
        System.out.println("Reverse  number : "+sum);//4321
    }
}
