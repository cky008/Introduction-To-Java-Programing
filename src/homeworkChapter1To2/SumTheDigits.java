package homeworkChapter1To2;

import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000");
        int number01 = input.nextInt();

        int n1 = number01 % 10;
        int number02 = number01 / 10;
        int n2 = number02 % 10;
        int n3 = number02 / 10;
        System.out.print("The sum of the digits is " + (n1 + n2 + n3));
    }
}
