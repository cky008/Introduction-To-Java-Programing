package homeworkChapter1To2;

import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius:");
        double radius = input.nextDouble();
        double area = radius*radius*3.1415926;
        System.out.println("The area for the circle of radius" + radius + " is " + area);
    }
}
