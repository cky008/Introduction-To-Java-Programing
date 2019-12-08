package homeworkChapter4;
import java.util.Scanner;
public class checkISBN10asString {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String inISBN = input.nextLine();
        //get d1_d9 and calculate the sum
        int sum = 0;
        for (int i = 0; i < 9; i++)
            sum = sum + (inISBN.charAt(i) - 48) * (i+1);
        //System.out.println(i + "   " + sum + "   " + (inISBN.charAt(i) - 48));
        //calculate d10 and output the 10 ISBN
        if (sum % 11 ==10)
            System.out.print("The ISBN-10 number is " + inISBN + "X");
        else
            System.out.print("The ISBN-10 number is " + inISBN + (sum % 11));
    }
}
