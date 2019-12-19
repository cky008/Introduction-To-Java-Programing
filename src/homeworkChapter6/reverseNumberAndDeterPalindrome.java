package homeworkChapter6;
import java.util.Scanner;
public class reverseNumberAndDeterPalindrome {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = input.nextInt();
        if (isPalindrome(num))
            System.out.print(num + " is a palindrome");
        else
            System.out.print(num + " is not a palindrome");
    }

    public static int reverse(int number){
        int rev = 0;
        while (number != 0){
            rev = rev *10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int number){
        if (number == reverse(number))
            return true;
        return false;
    }
}
