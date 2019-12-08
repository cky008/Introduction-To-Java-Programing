package homeworkChapter4;
import java.util.Scanner;
public class checkSSN {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String SSN = input.nextLine();
        if (SSN.length() != 11 || SSN.charAt(3) != '-' || SSN.charAt(6) != '-'){
            System.out.print(SSN + " is an invalid social security number");
            System.exit(1);
        }
        for(int i =0; i < 11; i++){
            if(i == 3 || i == 6) continue;
            if(Character.isDigit(SSN.charAt(i))){
                System.out.print(SSN + " is an invalid social security number");
                System.exit(1);
            }
        }
        System.out.print(SSN + " is an valid social security number");
    }
}
