package homeworkChapter5;
import java.util.Scanner;
public class computeGreatestCommonDivisor {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
         int n1 = input.nextInt(), n2 = input.nextInt();
         for (int d = Math.min(n1,n2); d > 0; d--){
             if(n1 % d == 0 && n2 % d == 0) {
                 System.out.print("The greatest common divisor of " + n1 + " and " + n2 + " is " + d);
                 System.exit(1);
             }
         }
    }
}
