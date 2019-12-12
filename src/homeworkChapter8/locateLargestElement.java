package homeworkChapter8;
import java.util.Scanner;
public class locateLargestElement {
    public static void main (String[] Args){
        double[][] in = getArr();
        int[] locate = locateLargest(in);
        System.out.print("The location of the largest element is at (" + locate[0] + ", " + locate[1] + ")");
    }

    public static double[][] getArr() {
        System.out.println("Enter the number of rows and columns of the array:");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        double[][] arr = new double[i][j];
        System.out.println("Enter the array:");
        for (int n = 0; n < i; n++){
            for (int m = 0; m < j; m++){
                arr[n][m] = input.nextDouble();
            }
        }
        return arr;
    }

    public static int[] locateLargest(double[][] inArr){
        int i,j;
        double max = 0;
        int[] outArr = new int[2];
        for (i = 0; i < inArr.length; i++){
            for (j = 0; j < inArr[i].length; j++){
                if (inArr[i][j] > max){
                    max = inArr[i][j];
                    outArr[0] = i;
                    outArr[1] = j;
                }
            }
        }
        return outArr;
    }
}
