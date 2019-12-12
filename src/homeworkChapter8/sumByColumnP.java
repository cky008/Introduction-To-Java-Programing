package homeworkChapter8;
public class sumByColumnP {
    public static void main(String[] Args){
        double[][] in = locateLargestElement.getArr();
        for (int i = 0; i < in[0].length; i++){
            System.out.println("Sum of the elements at column " + i + " is " + sumByColumn.sumColumn(in,i));
        }
    }
}
