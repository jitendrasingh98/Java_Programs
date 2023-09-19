package SearchingAndSorting;
import java.util.Scanner;
public class BubbleSort {

     static void swap(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
       // int[] arr= {84,52,32,45,65,20};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array :");
        int size = scan.nextInt();
        System.out.println("Enter the Array Element :");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Before Sorting : ");
        for(int i:arr){
            System.out.print(i+" ");
        }

        System.out.println();
        //function call
        swap(arr);
        System.out.println("After Sorting");

        for(int i:arr){
            System.out.print(i+" ");
        }
        }
}
