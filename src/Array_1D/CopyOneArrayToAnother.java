package Array_1D;
import java.util.Scanner;
public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int size = scan.nextInt();
        int array1[]=new int[size];//first array
        int array2[]=new int[array1.length];//second array

        System.out.println("Enter array Elements : ");
        for ( int i=0;i<size;i++){
             array1[i] = scan.nextInt();
        }
        System.out.println("Original Array...");
        for (int i=0;i<size;i++){
            System.out.print(array1[i]+" ");
        }

        //Copy array one to second

        for(int i=0;i<array1.length;i++){
            array2[i]=array1[i];
        }
        System.out.println("\nCopied Array...");
        for (int j=0;j<array2.length;j++){
            System.out.print(array2[j]+" ");
        }
    }
}
