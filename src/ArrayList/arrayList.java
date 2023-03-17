package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        //declare ArrayList
        ArrayList <Integer> num = new ArrayList<>();

        //Add Element
        num.add(100);
        num.add(50);
        num.add(25);
        num.add(20);
        System.out.println(num);

        //Get Element
        int ele = num.get(2);// get 2nd index value
        System.out.println(ele);

        //Add Element in specific index
        num.add(2,63);
        System.out.println(num);

        //Set Element in specific index
        num.set(3,45);
        System.out.println(num);

        //Delete Element from an index
        num.remove(2);
        System.out.println(num);

        //Size of the list
        int size = num.size();
        System.out.println(size);

        //Loops on lists
        for (int i=0;i<num.size();i++){
            System.out.print(num.get(i)+" ");
        }

        //Sorting
        Collections.sort(num);
        System.out.println("\n"+num);

        //Remove all the Elements of the list
        num.removeAll(num);
        System.out.println("Remove All the Elements of the List : "+num);


    }
}
