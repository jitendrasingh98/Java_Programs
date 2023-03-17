package ArrayList;

import java.util.ArrayList;

public class ConvertArrayListToArray1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(52);
        list.add(85);
        System.out.print("ArrayList : "+list);

        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println();
        System.out.print("Array :");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
