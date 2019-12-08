package homeworkChapter1To2;

import java.util.Scanner;

public class ShowCurrentTimeInSpecificTimeZone {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT:");
        long timeZone = input.nextLong();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long Hour = currentHour + timeZone;
        System.out.println("The current time is " + Hour + ":" + currentMinute + ":" + currentSecond);
    }
}
