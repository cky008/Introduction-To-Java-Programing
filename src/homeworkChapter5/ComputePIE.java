package homeworkChapter5;
public class ComputePIE {
    public static void main(String[] Args){
        for(int i = 10000; i <= 100000; i += 10000){
            double result = calculator(i);
            System.out.println("PIE for i = " + i + " is " + result);
        }
    }

    private static double calculator(int i){
        double resulting = 0;
        int n = 1;
        while (n <= i){
            resulting += getI(n);
            n++;
        }
        resulting *= 4;
        return resulting;
    }

    private static double getI(int in){
        double re;
        re = (Math.pow(-1, in+1)) / (2 * in - 1);
        return re;
    }
}