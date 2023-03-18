package Strings;
import java.util.Scanner;
public class PrintAllSubstring {
    public static void main(String[] args) {
      /*  String str= "abcd";
        for(int i=0;i<4;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = scan.nextLine();
        System.out.println("Substring : ");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
