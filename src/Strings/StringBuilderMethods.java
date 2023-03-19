package Strings;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);

        //setCharAt(index,char)
        str.setCharAt(2,'y');
        System.out.println(str);

        //insert(index,char)
        str.insert(3,"java");
        System.out.println(str);

        //deleteCharAt(index)
        str.deleteCharAt(2);
        System.out.println(str);

        //delete(start index,end index)
        str.delete(0,2);//0 to (2-1)index
        System.out.println(str);

        //reverse()
        str.reverse();
        System.out.println(str);
    }
}
