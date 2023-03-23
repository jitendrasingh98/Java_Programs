package Strings;
import java.util.Scanner;
public class StringBuilderUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Input");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.println("output : "+sb);
    }
}
