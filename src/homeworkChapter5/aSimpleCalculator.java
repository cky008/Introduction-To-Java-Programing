package homeworkChapter5;
import java.util.Scanner;
public class aSimpleCalculator {
    public static void main(String[] Args){
        System.out.print("Enter an integer, the input ends if it is 0: ");
        Scanner input = new Scanner(System.in);
        double total= 0, average, num;
        int pos= 0, neg = 0, count = 0;
        while ((num = input.nextDouble()) != 0){
            total += num;
            count ++;
            if(num < 0){
                neg ++;
            }
            else if(num > 0){
                pos ++;
            }
        }
        average = total / count;
        System.out.printf(
                "The number of positives is " + pos + "%n"
                        + "The number of negatives is " + neg + "%n"
                        + "The total is " + total + "%n"
                        + "The average is " + average
        );
    }
}
