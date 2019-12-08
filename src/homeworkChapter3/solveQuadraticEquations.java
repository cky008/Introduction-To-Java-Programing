package homeworkChapter3;
import java.util.Scanner;
public class solveQuadraticEquations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = Math.pow(b,2) - 4 * a * c;
        if (delta > 0 ) {
            double r1 = (-b + Math.pow(delta,0.5))/(2*a);
            double r2 = (-b - Math.pow(delta,0.5))/(2*a);
            System.out.print("The equation has two roots " + r1 + " and " + r2);
        }
        else if (delta == 0){
            double r = (-b)/(2*a);
            System.out.print("The equation has one root " + r);
        }
        else {
            System.out.print("The equation has no real roots");
        }
    }
}
