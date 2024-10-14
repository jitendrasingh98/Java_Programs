package PatternPrograms.StarPatterns;


/*
   *
  **
 ***
****

 */

import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Lines : ");
        int num = scanner.nextInt();
        //outer loop for rows
        for(int i=1;i<=num;i++){
            //inner loop for spaces
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }

            //second inner loop for print *
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            //for printing new line
            System.out.println();
        }
    }
}
