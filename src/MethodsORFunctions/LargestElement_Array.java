package MethodsORFunctions;
import java.util.Scanner;
public class LargestElement_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = scan.nextInt();
        int array[]=new int[100];
        System.out.println("Enter Array Element : ");
        for(int i=0;i<size;i++){
            array[i]= scan.nextInt();
        }
       int ans= large(size,array);
        System.out.println("Maximum Value Of This Array : "+ans);
    }

    static int large(int n , int arr[]){
        int max=arr[0];
        for (int i=0;i<n;i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
