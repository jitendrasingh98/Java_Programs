package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class arrayList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of ArrayList : ");
        int size = scan.nextInt();
        System.out.println("Enter ArrayList Elements : ");
        for(int i=0;i<size;i++){
            list.add(scan.nextInt());
        }
        System.out.print("ArrayList : ");
        for (int i : list){
            System.out.print(i+" ");
        }
    }
}
