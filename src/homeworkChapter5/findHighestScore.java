package homeworkChapter5;
import java.util.Scanner;
public class findHighestScore {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        String[] name = new String[num];
        double[] scores = new double[num];
        int[] ID = new int[num];
        double highest = 0;
        //input
        for(int i = 0; i < num; i++){
            ID[i] = i + 1;
            System.out.print("Enter name for student" + (i+1) + ": ");
            String temn;
            name[i] = input.next();
            System.out.print("Enter score for student" + (i+1) + ": ");
            double tems;
            scores[i] = input.nextDouble();
        }
        //find
        for(double score : scores){
            if(score > highest)
                highest = score;
        }
        //output
        System.out.println("The highest score and the student who get it are shown below: ");
        for (int i = 0; i < num; i++){
            if (scores[i] == highest){
                System.out.println("Student" + ID[i] + "  " + name[i] + "  " + (int)scores[i]);
            }
        }

    }
}
