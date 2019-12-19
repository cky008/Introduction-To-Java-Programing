package homeworkChapter6;

public class estimatePIE {

    public static void main(String[] Args){
        System.out.printf("%-5c%20s%n",'i',"m(i)");
        System.out.print("---------------------------------");
        for (int k = 1; k < 1000; k += 100){
            double P = m(k);
            System.out.printf("%n%-5d%22.4f",k,P);
        }
    }


    private static double m(int i){
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
