package homeworkChapter5;
import java.util.Scanner;
public class findTheFactors {
    public static void main(String[] Args){
        System.out.print("Enter a integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num != 0){
            for(int i = 2; i < 10; i++){
                while (num % i == 0){
                    if(num / i == 1){
                        System.out.print(i + ".");
                        System.exit(1);
                    }
                    System.out.print(i + ", ");
                    num = num / i;
                }
            }
        }
    }
}