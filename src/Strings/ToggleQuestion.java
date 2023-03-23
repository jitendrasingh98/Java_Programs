package Strings;

//Toggle all the characters of the string (TO convert lower case to upper case and upper case to lower case)
//input: PhysICS           output: pHYSics
import java.util.Scanner;

public class ToggleQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string :");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.println("before toggle :"+sb);
        for(int i=0;i<sb.length();i++){
            //check alphabet small,capital
            boolean flag =true; //true->capital
            char ch = sb.charAt(i);
            if (ch==' ') {
                continue;
            }
            if(ch>='A' && ch<='Z' || ch>='a' &&ch<='z'){
            int ascii =(int)ch;

                if (ascii >= 97) {
                    flag = false;
                }
                if (flag == true) {
                    ascii = ascii + 32;//ascii+=32;
                    char cha = (char) ascii;
                    sb.setCharAt(i, cha);
                } else {
                    ascii = ascii - 32;
                    char cha = (char) ascii;
                    sb.setCharAt(i, cha);
                }
            }
        }
        System.out.println("After Toggle "+sb);
    }
}
