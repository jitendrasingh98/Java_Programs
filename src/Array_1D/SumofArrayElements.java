package Array_1D;
import java.util.Scanner;
public class SumofArrayElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the Elements : ");
        for (int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println(" Array Is ...");
        for (int i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }
      //  System.out.println("\n Sum of Array : ");
        int sum=0;
        for (int i=0;i<size;i++){
            sum=sum+array[i];
        }
        System.out.println("\n Sum of Array : "+sum);
    }
}
