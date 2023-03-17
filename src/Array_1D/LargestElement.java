package Array_1D;
import java.util.Scanner;

//Maximum Value of Array by using Library Function
public class LargestElement {
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
        //for Maximum value of array
        System.out.println("\nMaximum value of this array :");
        int max=array[0];
        for (int i=0;i<size;i++) {
            max = Math.max(max, array[i]);
           }
        System.out.println(max);
        }
    }

