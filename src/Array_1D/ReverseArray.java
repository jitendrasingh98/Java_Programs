package Array_1D;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println(" Original Array Is....");
        for (int i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println("\n Reverse Array Is....");
        for (int i=size-1;i>=0;i--){
            System.out.print(" "+array[i]);
        }
    }
}
