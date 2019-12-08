package homeworkChapter3;

import java.util.Scanner;

public class determineThePalindromeNumber {
    public  static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();
        int digitOne = num / 100;
        int digitThree = num % 100 % 10;
        if (digitOne == digitThree){
            System.out.print(num + " is a palindrome");
        }
        else {
            System.out.print(num + " is not a palindrome");
        }
    }
}
