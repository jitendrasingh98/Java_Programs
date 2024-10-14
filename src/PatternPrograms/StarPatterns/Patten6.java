package PatternPrograms.StarPatterns;

import java.util.Scanner;

/*
n=4
star=4
****
 ****
  ****
   ****
 */
public class Patten6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int rows = scan.nextInt();
        System.out.println("Enter the number of stars in each row : ");
        int star = scan.nextInt();

        //outer loop for rows
        for(int i=0;i<rows;i++){
            //inner loop for spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //second inner loop for printing stars
            for (int k=0;k<star;k++){
                System.out.print("*");
            }
            //for new line
            System.out.println();
        }


    }
}
