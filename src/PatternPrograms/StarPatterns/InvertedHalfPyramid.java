package PatternPrograms.StarPatterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of lines :");
        int num = scanner.nextInt();
        //outer loop for no of  rows
        for(int row=num;row>=1;row--){
            //inner loop for no of col
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
