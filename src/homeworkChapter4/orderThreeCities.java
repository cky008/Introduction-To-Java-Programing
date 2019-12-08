package homeworkChapter4;
import java.util.Scanner;
public class orderThreeCities {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();
        if (thirdCity.compareToIgnoreCase(secondCity) < 0) {
            String tem0 = thirdCity;
            thirdCity = secondCity;
            secondCity = tem0;
            if (secondCity.compareToIgnoreCase(firstCity) < 0) {
                tem0 = secondCity;
                secondCity = firstCity;
                firstCity = tem0;
                if (thirdCity.compareToIgnoreCase(secondCity) < 0){
                    tem0 = thirdCity;
                    thirdCity = secondCity;
                    secondCity = tem0;
                }
            }
        }
        else {
            if (secondCity.compareToIgnoreCase(firstCity) < 0) {
                String temO = secondCity;
                secondCity = firstCity;
                firstCity = temO;
                if (thirdCity.compareToIgnoreCase(secondCity) < 0){
                    String tem0 = thirdCity;
                    thirdCity = secondCity;
                    secondCity = tem0;
                }
            }
        }
        System.out.print("The three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity);
    }
}
