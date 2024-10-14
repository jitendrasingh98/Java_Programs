package PatternPrograms.StarPatterns;

import java.util.Scanner;

/*
         ****
         ****
         ****
         ****
 */
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of lines :");
        int num = scanner.nextInt();
        //outer loop for no of rows
        for (int row=1;row<=num;row++){
            for (int col=1;col<=num;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
