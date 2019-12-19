package homeworkChapter6;
import java.util.Scanner;
public class approximateSquareRoot {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num to get it's square root: ");
        long inNum = input.nextLong();
        System.out.print("The square root of " + inNum + " is " + sqrt(inNum));
    }

    public static double sqrt(long n){
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        while (nextGuess - lastGuess > 0.0000000001 || lastGuess - nextGuess > 0.0000000001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }
}
