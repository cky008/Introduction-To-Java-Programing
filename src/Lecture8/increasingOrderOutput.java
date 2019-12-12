package Lecture8;

public class increasingOrderOutput {
    /** Main method */
    public static void main(String[] Args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        int[] studentScores = new int[answers.length];

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            studentScores[i] = correctCount;
        }
        for (int z = 0; z < studentScores.length; z++) {
            System.out.println("Student " + z + "'s correct count is " + studentScores[z]);
        }

        System.out.println("");
        System.out.println("============================================================");
        System.out.println("=======     One Way to print in increasing order     =======");
        System.out.println("============================================================");
        System.out.println("");

        int p = 0;
        while (p != keys.length) {
            for (int m = 0; m < studentScores.length; m++) {
                if (studentScores[m] == p) {
                    System.out.println("Student " + m + "'s correct count is " + studentScores[m]);
                }
            }
            p++;
        }

        System.out.println("");
        System.out.println("============================================================");
        System.out.println("=======   Another Way to print in increasing order   =======");
        System.out.println("============================================================");
        System.out.println("");

        for (int k = 0; k < studentScores.length; k++) {
            //find the minimum in studentScores
            int currentMin = studentScores[k];
            int currentMinIndex = k;
            for (int m = 0; m < studentScores.length; m++) {
                if (currentMin > studentScores[m]) {
                    currentMin = studentScores[m];
                    currentMinIndex = m;
                }
            }
            System.out.println("Student " + currentMinIndex + "'s correct count is " + currentMin);
            studentScores[currentMinIndex] = 100;
        }


    }
}
