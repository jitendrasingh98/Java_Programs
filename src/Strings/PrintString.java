package Strings;
import java.util.Scanner;
public class PrintString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scan.nextLine();
        System.out.println("Hello "+name);
    }
}
