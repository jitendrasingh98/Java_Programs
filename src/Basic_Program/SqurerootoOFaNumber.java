package Basic_Program;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class SqurerootoOFaNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Number : ");
        double num =scan.nextDouble();
        double root =Math.sqrt(num);
        System.out.println(root);
    }
}
