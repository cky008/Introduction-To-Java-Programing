package homeworkChapter6;

public class findPrimeNum {
    public static void main(String[] Args) {
        int numOfPrime = 0;
        for (int i = 0; i < 10000; i++){
            if (isPrime(i))
                numOfPrime++;
        }
        System.out.print("The number of prime numbers less than 10000 is " + numOfPrime);
    }

    /**
     * Check whether number is prime
     */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return true;
    }
}
