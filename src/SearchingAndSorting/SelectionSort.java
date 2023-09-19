package SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {
    static void sort(int[] arr){
        int size =arr.length;
        for(int i=0;i<size-1;i++){
            int min_index = i;//assign min element
            for (int j=i+1;j<size;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            //for swapping min element and current element
            int temp =arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
       // int[] arr ={45,58,56,20,65};
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int size = scan.nextInt();
        System.out.println("Enter Array Elements :");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Before Sorting : ");
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        sort(arr);
        System.out.println("After Sorting : ");
        for (int i:arr)
            System.out.print(i+" ");
    }
}
