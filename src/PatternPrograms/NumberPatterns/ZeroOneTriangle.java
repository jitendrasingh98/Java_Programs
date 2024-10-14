package PatternPrograms.NumberPatterns;

import java.util.Scanner;

/* n=5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int row = scanner.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    //even for print 1
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
