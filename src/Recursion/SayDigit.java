package Recursion;

//print the given digits
//412 : four one two
//9563 : nine five six three4

import java.util.Scanner;
public class SayDigit {
    static void digit(int num, String[] arr){
       //base case
        if(num==0)
            return;

        //processing
        int digit = num%10;
         num = num/10;

         //recursive call
        digit(num,arr);

        System.out.print(arr[digit]+" ");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println("Enter Number");
        int num = scan.nextInt();
        digit(num,arr);

    }
}
