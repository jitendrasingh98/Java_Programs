package PatternPrograms.NumberPatterns;

import java.util.Scanner;

/* n=5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int row = scanner.nextInt();
        int number=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;//to increase value of count
            }
            System.out.println();
        }
    }

}
