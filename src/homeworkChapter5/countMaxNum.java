package homeworkChapter5;
import java.util.Scanner;
public class countMaxNum {
    public static void main(String[] Args){
        System.out.print("Enter numbers: ");
        Scanner input = new Scanner(System.in);

        String in = input.nextLine();
        String[] arr = in.split(" ");
        int max = 0, count = 0;
        for(String ele: arr)
            max = Math.max(max, Integer.parseInt(ele));
        for (String ele: arr){
            if (Integer.parseInt(ele) == max)
                count++;
        }
        System.out.printf("The largest number is " + max + "%n + The occurrence count of the largest number is " + count);
    }
}
