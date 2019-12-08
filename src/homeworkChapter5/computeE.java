package homeworkChapter5;

public class computeE {
    public static void main(String[] Args){
        for (int i = 10000; i <= 100000; i += 10000){
            double result = calculator(i);
            System.out.println("The E for i = " + i + " is " + result);
        }
    }

    private static double calculator(int i){
        double result = 1;
        int n = 1;
        while (n <= i){
            result += fac(n);
            n++;
        }
        return result;
    }

    private static double fac(int n){
        if (n == 1)
            return 1;
        double f = 1;
        for(int i = n; i >= 1; i--){
            f *= 1.0 / (i);
        }
        return f;
    }
}
