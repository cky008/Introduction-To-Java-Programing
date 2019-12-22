package homeworkChapter7;
import java.util.Scanner;
public class sortStudents {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        String[] names = new String[number];
        double[] scores = new double[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the name of student " + (i +1));
            names[i] = input.next();
            System.out.println("Enter the score of " + names[i]);
            scores[i] = input.nextDouble();
        }

        for (int k = 0; k < number; k++) {
            double currentMax = scores[k];
            int currentMaxIndex = k;
            for (int m = 0; m < number; m++){
                if (currentMax < scores[m]){
                    currentMax = scores[m];
                    currentMaxIndex = m;
                }
            }
            System.out.println("Student " + names[currentMaxIndex] + "'s score is " + currentMax);
            scores[currentMaxIndex] = -1;
        }
    }

}
