package homeworkChapter8;
import java.util.Scanner;
public class sumByColumn {
    public static void main(String[] Args){
        double[][] in = getArr();
        for (int i = 0; i < in[0].length; i++){
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(in,i));
        }
    }

    public static double[][] getArr() {
        Scanner input = new Scanner(System.in);
        double[][] arr = new double[3][4];
        System.out.println("Enter the array:");
        for (int n = 0; n < 3; n++){
            for (int m = 0; m < 4; m++){
                arr[n][m] = input.nextDouble();
            }
        }
        return arr;
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
