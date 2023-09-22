package SearchingAndSorting;
import java.util.Scanner;

public class RecursiveBinarySearch {
    static int recBinarySearch(int[] arr, int first, int last ,int target){

         if(first>last) {
             return -1;
         }
         int mid = first+(last-first)/2;
         if(target == arr[mid]) {
             return mid;
         }
         else if (target<arr[mid]) {
             return recBinarySearch(arr, first, mid-1, target);
         }
         else {
            return recBinarySearch(arr, mid + 1, last, target);
         }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scan.nextInt();
        System.out.println("Enter Array Element in Increment Order :");
        int arr[] = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter element you want to be search in array : ");
        int target = scan.nextInt();
        int  first =0;
        int last= arr.length-1;
        int result = recBinarySearch(arr,first,last,target);

        if(result==-1)
            System.out.println("Element not Found in this array.");
        else
            System.out.println(target+" Found in index "+result);
    }
}
