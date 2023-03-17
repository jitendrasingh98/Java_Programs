package Array_1D;
import java.util.Scanner;
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[100];
        System.out.println("Enter the Size of Array :");
        int size = scan.nextInt();
        System.out.println("Enter Array Element :");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        //for searching duplicate element
        System.out.println("\n Duplicate Elements Present in Array : ");
        for(int i=0;i<size;i++) {
            for (int j = i+1; j < size; j++)
                if(array[i] == array[j])
            System.out.print(" " + array[j]);
        }
    }
}
