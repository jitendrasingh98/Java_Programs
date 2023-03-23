package Strings;

//print all palindromic substrings and its count

import java.util.Scanner;

public class PalindromeSubstrings {
    public static boolean isPalindrome(String st){
        int i=0;
        int j=st.length()-1;
        while (i<j){
            if(st.charAt(i)!=st.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = scan.nextLine();
        System.out.println("Palindromic Substring : ");
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nNumber of SubStrings : "+count);
        }
    }

