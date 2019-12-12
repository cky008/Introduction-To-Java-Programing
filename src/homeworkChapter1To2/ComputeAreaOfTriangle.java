package homeworkChapter1To2;

import java.util.Scanner;
public class ComputeAreaOfTriangle {
    private static Double GetLength(double[] point_a, double[] point_b){
        return Math.sqrt(Math.pow(point_a[0] - point_b[0],2) + Math.pow(point_a[1] - point_b[1],2));
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle(x1 y1 x2 y2 x3 y3):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double side1 = GetLength(new double[]{x1,y1},new double[]{x2,y2});
        double side2 = GetLength(new double[]{x1,y1},new double[]{x3,y3});
        double side3 = GetLength(new double[]{x2,y2},new double[]{x3,y3});
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is: " + Math.round(area * 10) / 10.0);
    }
}
