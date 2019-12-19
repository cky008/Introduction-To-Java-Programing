package homeworkChapter6;
import java.util.Scanner;
public class sumAllDigits {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int outp = input.nextInt();
        System.out.print("The sum of all digits in integer " + outp + " is " + sumDigits(outp));
    }

    public static int sumDigits(int num){
        int sum = 0;
        while (num != 0){
            sum = sum + num % 10;
            num /= 10;
        }
        return sum;
    }
}
