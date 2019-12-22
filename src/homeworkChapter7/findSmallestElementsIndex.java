package homeworkChapter7;
import java.util.Scanner;
public class findSmallestElementsIndex {
    public static void main(String[] Args) {
        double[] array = getInputArray();
        double smallest = getSmallestElement(array);
        System.out.print("Your array is: ");
        for (double e: array)
            System.out.print(e + ", ");
        System.out.println();
        System.out.println("The smallest number is " + smallest + " and its index is " + getIndex(array,smallest));
    }

    private static double[] getInputArray() {
        System.out.println("Please Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] NumArr = new double[10];
        for (int i = 0; i < 10; i++)
            NumArr[i] = input.nextDouble();
        return NumArr;
    }

    private static double getSmallestElement(double[] NumberArr) {
        double smallest = NumberArr[0];
        for (double e: NumberArr)
            smallest = Math.min(smallest, e);
        return smallest;
    }

    private static int getIndex(double[] array, double value) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == value)
                return i;
        }
        return 0;
    }
}
