package MethodsORFunctions;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scan.nextInt();
        int array[] = new int[200];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Enter element to be searched : ");
        int ele = scan.nextInt();
        int ans = linearSearch(ele, array);
    }

    static int linearSearch(int element, int arr[]) {
        int n = arr.length;
        int count = 0;
        int i;
        for ( i = 0; i < n; i++) {
            if (arr[i] == element) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Element is Present in the list/Array at position " + i);
        } else
            System.out.println("Element is not present.");

        return element;
    }
}
