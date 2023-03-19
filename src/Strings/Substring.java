package Strings;

public class Substring {
    public static void main(String[] args) {
        String str ="jitendra";
       /* for(int i=0;i<4;i++){
            System.out.println(str.substring(i));
        }*/
        //change i to e
        str=str.substring(0,1)+'e'+str.substring(2);
        System.out.println(str);
    }
}
