package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scan.nextLine();
        System.out.println("original String : "+str);
        String revst = "";
        for(int i=str.length()-1;i>=0;i--){
            revst = revst+str.charAt(i);
        }
        System.out.println("Reverse String : "+revst);
        if(str.equals(revst)){
            System.out.println("Palindrome.");
        }
        else
            System.out.println("not palindrome.");
    }
}
