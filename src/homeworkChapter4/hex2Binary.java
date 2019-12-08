package homeworkChapter4;
import java.util.Scanner;
public class hex2Binary {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = (input.nextLine()).toUpperCase();
        //只能转小于8位的
        if (hexString.length() >= 8) {
            System.out.println("You must enter exactly a number length less than 8");
            System.exit(1);
        }
        //16转10 保存至val
        String digits = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0; i < hexString.length(); i++){
            char temStr = hexString.charAt(i);
            int temNum = digits.indexOf(temStr);
            val = 16 * val + temNum;
        }
        //10转2
        int temO;
        String outer = "";
        while(val != 0){
            temO = val % 2;
            val = val / 2;
            outer = temO + outer;
        }
        System.out.println("The Binary Value is " + outer);
    }
}
