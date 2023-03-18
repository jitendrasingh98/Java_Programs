package Strings;
import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args) {

        /*Scanner scan =new Scanner(System.in);
        System.out.println("Enter String :");
        String str = scan.next();//print till space
        String str=scan.nextLine();//print complete line
        System.out.println(str);*/
        /*
        //charAt() and length()
        String str = "jitendra singh";
        char ch=str.charAt(4);//store 4th index value
        System.out.println(ch);
        System.out.println(str.length());//print string length
         */
        /*
        //indexOf() and compareTo()
        String str = "jitendra singh";
        String str1 ="hello";
        System.out.println(str.indexOf('h'));
        System.out.println(str.compareTo(str1));*/

        //contains() and startsWith(), endsWith()
      /*String str = "jitendra singh";
        System.out.println(str.contains("hello"));
        System.out.println(str.startsWith("jit"));
        System.out.println(str.endsWith("gh"));
        */

        //toLowerCase() , toUpperCase()
     /*   String str = "Jitendra Singh";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());*/

        //concat()
       /* String str1 = "jitendra";
        String str2="singh";
        String str=str1.concat(str2);
        System.out.println(str);

        //another way to concat
        System.out.println(str1+str2);
        System.out.println(str1+10);
        System.out.println(str1+10+str2);
        System.out.println(10+str1);*/

        //substring(i,j) and substring(i)
        String str = "abcdefghijkl";
        System.out.println(str.substring(3));//starting with 3rd index
        System.out.println(str.substring(2,6));//2nd index to 5th index



    }
}
