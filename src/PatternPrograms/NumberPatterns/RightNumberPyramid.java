package PatternPrograms.NumberPatterns;

import java.util.Scanner;

/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class RightNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Rows : ");
        int num = scanner.nextInt();
        //outer loop for rows
        for(int i=1;i<=num;i++){
            //inner loop for print values
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //for new line
            System.out.println();
        }
    }
}
