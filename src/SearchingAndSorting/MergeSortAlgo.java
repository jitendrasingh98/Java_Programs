package SearchingAndSorting;
import java.util.Scanner;
public class MergeSortAlgo {

    // Merge two subarrays of arr[]
    // First subarray is arr[left..mid]
    // Second subarray is arr[mid+1..right]
    static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int left_arr_size = mid - left + 1;
        int right_arr_size = right - mid;

        // Create temporary arrays
        int[] left_arr = new int[left_arr_size];
        int[] right_arr = new int[right_arr_size];

        // Copy data to temporary arrays
        for (int i = 0; i < left_arr_size; i++) {
            left_arr[i] = arr[left + i];
        }
        for (int j = 0; j < right_arr_size; j++) {
            right_arr[j] = arr[mid + 1 + j];
        }

        // Initial indices of left and right subarrays
        int i = 0, j = 0;

        // Initial index of merged array
        int k = left;

        // Merge the two subarrays
        while (i < left_arr_size && j < right_arr_size) {
            if (left_arr[i] <= right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
            } else {
                arr[k] = right_arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left_arr[], if any
        while (i < left_arr_size) {
            arr[k] = left_arr[i];
            i++;
            k++;
        }

        // Copy remaining elements of right_arr[], if any
        while (j < right_arr_size) {
            arr[k] = right_arr[j];
            j++;
            k++;
        }
    }

    // Main function to perform mergesort
    static void mergesort(int[] arr, int left, int right) {
        if (left < right) {
            // Find middle of array
            int mid = (left + right) / 2;

            // Sort left subarray
            mergesort(arr, left, mid);

            // Sort right subarray
            mergesort(arr, mid + 1, right);

            // Merge the two sorted subarrays
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
       // int[] arr = {47, 85, 52, 36, 45};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = scan.nextInt();
        System.out.println("Enter array Elements : ");
        int[] arr = new int[size];
        for (int i=0;i<size;i++)
            arr[i] = scan.nextInt();
        System.out.println("Before Sorting : ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();

        // Call mergesort function to sort the array
        mergesort(arr, 0, arr.length - 1);

        System.out.println("After Sorting : ");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
