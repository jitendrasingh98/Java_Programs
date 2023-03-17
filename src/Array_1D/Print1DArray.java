package Array_1D;
import java.util.Scanner;
public class Print1DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of an Array : ");
        int size =scan.nextInt();
        int array[] =new int[size];
        int i;
        System.out.println("Enter Elements : ");
        for(i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println(" Array Is.... ");
        for(i=0;i<size;i++){
            System.out.println(" "+array[i]);
        }

    }
}
