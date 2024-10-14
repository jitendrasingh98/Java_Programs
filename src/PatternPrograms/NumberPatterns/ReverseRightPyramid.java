package PatternPrograms.NumberPatterns;

import java.util.Scanner;

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class ReverseRightPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int num = scanner.nextInt();
        //outer loop for rows
        for(int i=num;i>=1;i--){
            //inner loop for values
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

