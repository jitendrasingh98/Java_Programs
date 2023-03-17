package ArrayList;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<>();
        lang.add("Hindi");
        lang.add("English");
        lang.add("Urdu");
        lang.add("Java");
        System.out.println("ArrayList : "+lang);

        //Create a new Array of String Type
        String arr[]=new String[lang.size()];

        //Convert ArrayList into an Array
        lang.toArray(arr);
        System.out.print("Array :");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
