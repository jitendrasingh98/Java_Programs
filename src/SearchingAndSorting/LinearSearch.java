package SearchingAndSorting;
import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int[] arr, int size , int ele) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        //   int[] arr = {10,20,30,4,0,89,45};
        //  int ele = 89;
        //for User Input
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size = scan.nextInt();
        System.out.println("enter array elements :");
        int[] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter element to search :");
        int ele= scan.nextInt();
            int result =linearSearch(arr,arr.length,ele);
            if(result==-1){
                System.out.println("Element not found");
            }
            else {
                System.out.println("Element Found at index "+result);
            }

        }

}
