package homeworkChapter7;

public class primeNumberArray {
    public static void main(String[] args) {
        int NUM = 50;
        getPrimeNumbers(NUM);
    }

    private static void getPrimeNumbers(int NUMBER){
        System.out.println("The first " + NUMBER + " prime numbers are");
        int[] PrimeNumbers = getPrimeNumArr(NUMBER);
        recheckAndPrintPrimeNumbers(PrimeNumbers);
    }

    private static void recheckAndPrintPrimeNumbers(int[] PrimeNum){
        int count = 0;
        for (int e: PrimeNum){
            if ((Math.pow(e,2) + 1) % e != 0) {
                System.out.printf("%-5d",e);
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

    private static int[] getPrimeNumArr(int num){
        int[] PrimeNum = new int[num];
        int count = 0;
        int NUMB = 2;
        int i =0;
        while (count < num) {
            if (isPrime(NUMB)){
                PrimeNum[i++] = NUMB;
                count++;
            }
            NUMB++;
        }
        return PrimeNum;
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true; // Is the current number prime?
        // Test if number is prime
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                isPrime = false; // Set isPrime to false
                break; // Exit the for loop
            }
        }
        return isPrime;
    }
}
