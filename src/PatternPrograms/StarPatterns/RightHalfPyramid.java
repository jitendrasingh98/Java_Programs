package PatternPrograms.StarPatterns;
import java.util.Scanner;
public class RightHalfPyramid {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of Lines/Rows : ");
        int num = scanner.nextInt();
       for(int row=1;row<=num;row++){
           for(int col=1;col<=row;col++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
