package PatternPrograms.StarPatterns;

import java.util.Scanner;

/*
        *****
        *   *
        *   *
        *****
 */
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int rows = scanner.nextInt();
        System.out.println("Enter the no of COl : ");
        int col = scanner.nextInt();
        //outer loop for rows
        for (int i=1;i<=rows;i++){
            //inner loop for col
            for(int j=1;j<=col;j++){
                if (i==1||j==1||i==rows||j==col){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
