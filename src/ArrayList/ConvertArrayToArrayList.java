package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        //create an array
        String arr[] =  {"A","B"};
        System.out.println("Array : ");
       /* for (int i=0;i< array.length;i++) {
            System.out.print(array[i]+" ");
        }*/

        //for each loop
       for (String i:arr){
            System.out.println(i);
        }

        //create an ArrayList
        ArrayList<String>  list= new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList : "+list);

    }
}
