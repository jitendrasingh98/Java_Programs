package Array_1D;
import java.util.Scanner;
public class FindEvenAndOddElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int size = scan.nextInt();
        int array[]=new int[size];
        System.out.println("Enter Elements : ");
        for (int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Array Is.....");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }

        //for Even Elements
       System.out.println("\nEven Elements Are....");
        for (int i=0;i<size;i++){
            if(array[i]%2==0)
                System.out.print(array[i]+" ");
        }

        //for Odd Elements
        System.out.println("\nOdd Elements Are....");
        for (int i=0;i<size;i++){
            if(array[i]%2!=0)
                System.out.print(array[i]+" ");
        }
    }
}
