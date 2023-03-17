package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntegerArrayToArrayList1 {
    public static void main(String[] args) {
        int arr[]={10,20,3,0,4,56,8,52};
        System.out.print("Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //using java8 Stream API
        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println();
        System.out.println("ArrayList : "+list);
    }
}
