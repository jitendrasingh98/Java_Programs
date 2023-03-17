package ArrayList;

import java.util.ArrayList;

public class ConvertIntegerArrayToArrayList {
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,40};
        System.out.print("Array : ");
        for(int i :arr){
            System.out.print(i+" ");
    }
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();

        //using for each loop
        for (int i :arr){
            list.add(i);
        }
        System.out.println("ArrayList : "+list);

    }
}
