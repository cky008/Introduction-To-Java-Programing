package homeworkChapter7;
import java.util.Scanner;
public class eleminateDuplicates {
    public static void main(String[] Args){
        int[] array = getInputArray();
        int[] disNum = eliminateDuplicates(array);
        System.out.print("The distinct numbers are:");
        for (int e: disNum)
            System.out.print(" " + e);
    }

    private static int[] eliminateDuplicates(int[] list) {
        int dis = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length -1 ; j > -1; j--) {
                if (list[i] == list[j] && i != j) {
                    if (list[j] != 0)
                        dis++;
                    list[j] = 0;
                }
            }
        }
        return getIntArr(list,dis);
    }

    private static int[] getInputArray() {
        System.out.println("Please Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        int[] NumArr = new int[10];
        for (int i = 0; i < 10; i++)
            NumArr[i] = input.nextInt();
        return NumArr;
    }

    private static int[] getIntArr(int[] halfArr, int disNum){
        int[] resultArr = new int[halfArr.length - disNum];
        int temZero = 0;
        for (int n = 0; n < resultArr.length; n++){
            for (int m = n + temZero; m < halfArr.length; m++){
                if (halfArr[m] == 0) {
                    temZero++;
                    continue;
                }
                resultArr[n] = halfArr[m];
                break;
            }
        }
        return resultArr;
    }
}
