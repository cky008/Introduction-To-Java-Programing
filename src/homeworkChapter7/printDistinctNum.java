package homeworkChapter7;
import java.util.Scanner;
public class printDistinctNum {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers (i.e. 1 2 3 2 1 6 3 4 5 2) : ");
        String inStr = input.nextLine();
        String[] inStrArr = inStr.split(" ");
        int[] distinctArr = getDistinctArr(inStrArr);
        System.out.printf("The number of distinct number is " + distinctArr.length + "%nThe distinct numbers are:");
        for (int e : distinctArr){
            System.out.print(" " +e);
        }
    }

    private static int[] getDistinctArr(String[] inArr) {
        int dis = 0;
        for (int i = 0; i < inArr.length; i++) {
            for (int j = inArr.length -1 ; j > -1; j--) {
                if (inArr[i].equals(inArr[j]) && i != j) {
                    if (!inArr[j].equals("0"))
                        dis++;
                    inArr[j] = "0";
                }
            }
        }
        return getIntArr(inArr,dis);
    }

    private static int[] getIntArr(String[] halfArr, int disNum){
        int[] resultArr = new int[halfArr.length - disNum];
        int temZero = 0;
        for (int n = 0; n < resultArr.length; n++){
            for (int m = n + temZero; m < halfArr.length; m++){
                if (halfArr[m].equals("0")) {
                    temZero++;
                    continue;
                }
                resultArr[n] = Integer.parseInt(halfArr[m]);
                break;
            }
        }
        return resultArr;
    }
}
