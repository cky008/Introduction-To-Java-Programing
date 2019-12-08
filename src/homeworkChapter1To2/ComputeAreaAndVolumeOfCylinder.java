package homeworkChapter1To2;

import java.util.Scanner;

public class ComputeAreaAndVolumeOfCylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius:");
        double radius = input.nextDouble();
        System.out.print("Enter a number for length:");
        double length = input.nextDouble();
        final double PIE = 3.14159;

        double area = radius * radius * PIE;
        double volume = area * length;
        System.out.println("The area is " + (Math.round(area * 10000) / 10000.0));
        System.out.println("The volume is " + (Math.round(volume * 10) / 10.0));
    }
}
