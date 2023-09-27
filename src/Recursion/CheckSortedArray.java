//check given array is sorted or not
// 2,4,6,8,10   - sorted
//8,2,4,3,7     -unsorted
package Recursion;
import java.util.Scanner;
import java.lang.Boolean;
public class CheckSortedArray {
    static Boolean isSorted(int[] arr,int size){
        //base case
        if(size == 0 || size == 1) {
            return true;
        }

        //recursive relation
        if(arr[size-1]<arr[size-2]) {
            return false;
        }
        else {
            boolean remainingPartOfArray = isSorted(arr,size-1);
            return remainingPartOfArray;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scan.nextInt();
        System.out.println("Enter array Elements : ");
        int[] arr = new int[size];
        for (int i=0 ;i<size;i++){
            arr[i] = scan.nextInt();
        }
        boolean ans =isSorted(arr,size);
        if(ans)
            System.out.println("Array is Sorted.");
        else
            System.out.println("Array is Unsorted.");

    }
}
