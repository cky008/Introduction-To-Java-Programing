package homeworkChapter3;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or a number:");
        String str = input.nextLine();
        int len = str.length();
        int start = 0;
        int end = len - 1;
        boolean palindrome = true;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                palindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (palindrome){
            System.out.print(str + " is a palindrome");
        }
        else{
            System.out.print(str + " is not a palindrome");
        }
    }
}
