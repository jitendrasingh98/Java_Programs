package Array_1D;
import java.util.Scanner;

//Smallest Element of array by using library function

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size = scan.nextInt();
        System.out.println("Enter the Array Element : ");
        int array[] = new int[100];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Array is :");
        for(int i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }
        //for Minimum value of array
        System.out.println("\nMinimum value of this array :");
        int min=array[0];
        for (int i=0;i<size;i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println(min);
    }
}
