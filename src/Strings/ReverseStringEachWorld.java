package Strings;

//input : i am educator
//output: i ma rotacude

import java.util.Scanner;

public class ReverseStringEachWorld {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scan.nextLine();
       // String str = " i am educator";
        String ans="";//empty string
        StringBuilder sb = new StringBuilder("");//create empty string builder
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);//store character
            if(ch!=' '){//check last character is space or not
                sb.append(ch);//append  space
            }
            else {
                sb.reverse();//reverse word
                ans += sb;//append reverse word
                ans += " ";//append space
                sb = new StringBuilder("");//empty string builder
            }
        }
        sb.reverse();//again reverse
        ans+=sb;
        System.out.println(ans);
    }
}
