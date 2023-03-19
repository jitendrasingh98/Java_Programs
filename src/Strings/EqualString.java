package Strings;

public class EqualString {
    public static void main(String[] args) {
        String str1="jitendra";
        String str2="jitendra";
        String str3 = new String("jitendra");
        System.out.println(str1==str2);//same address
        System.out.println(str1==str3);//difference address
        System.out.println(str3.equals(str3));
        //== operator check address
        //equals() check both address and string
    }
}
