package Strings;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = scan.nextLine();
        System.out.println("Original String : "+str);
        String revstr=" ";
        for(int i=str.length()-1;i>=0;i--){
            revstr=revstr+str.charAt(i);
        }
        System.out.println("Reverse String : "+revstr);

    }
}
