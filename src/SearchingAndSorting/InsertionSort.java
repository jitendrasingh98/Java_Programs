package SearchingAndSorting;


import java.util.Scanner;

public class InsertionSort {
    static void insertion(int[] arr){
    //  int size= arr.length;
      for (int i=0;i< arr.length;i++){
          int j=i;
          while(j>0 && arr[j]<arr[j-1]){
              int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
          }
      }
    }
    public static void main(String[] args) {
        //int[] arr ={41,25,3,5,12};
        //for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array Elements : ");
        for(int i=0;i<size ;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Before Sorting : ");
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        insertion(arr);
        System.out.println("After Sorting : ");
        for (int i:arr)
            System.out.print(i+" ");
    }
}
