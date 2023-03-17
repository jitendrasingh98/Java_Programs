package Array_1D;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = scan.nextInt();
        int array[] = new int[100];
        int count=0;
        int i;
        System.out.println("Enter the Array Element : ");
        for( i=0;i<size;i++){
            array[i] = scan.nextInt();
        }
      /*  System.out.println("Array is :");
        for ( i=0;i<size;i++){
            System.out.print("  "+array[i]);
        }*/
        System.out.println("\n Enter Element to be Searched :");
        int ele = scan.nextInt();
            for( i=0;i<size;i++){
                if(array[i]==ele){
                    count++;
                    break;
                }
            }
        if(count>0){
            System.out.println("Element is Present in the list/Array at position "+i);
        }

        else
            System.out.println("Element is not present.");
    }
}
