package MethodsORFunctions;
import java.util.Scanner;
public class SmallestElement_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[]=new int [100];
        System.out.println("Enter the size of Array :");
        int size= scan.nextInt();
        System.out.println("Enter the Array Element :");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        int ans=small(array,size);
        System.out.println("Minimum value of this Array : "+ans);
    }
    static int small(int arr[],int n){
        int min=arr[0];
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}
