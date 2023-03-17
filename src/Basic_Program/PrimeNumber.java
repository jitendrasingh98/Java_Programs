package Basic_Program;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");//6
        int num = sc.nextInt();
        int flag = 0;
        if (num == 0 || num == 1) {
            System.out.println("Not Prime.");
        } else {
            for (int i = 2; i <= num / 2; i++) {//2<=3T,3<=3T,4<=3F
                if (num % i == 0)// 6%2=0T,6%3=0T
                    flag++;//1,2
            }
            if (flag == 0)//2F
                System.out.println("Prime.");
            else
                System.out.println("Not Prime.");
        }
    }
}
