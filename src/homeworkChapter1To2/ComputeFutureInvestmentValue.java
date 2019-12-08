package homeworkChapter1To2;

import java.util.Scanner;
public class ComputeFutureInvestmentValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double monthlyInterestRate = ((input.nextDouble()) / 100.0) / 12;
        System.out.print("Enter number of years:");
        int numberOfYears = input.nextInt();

        double accumulatedValue = investmentAmount * Math.pow(1 + monthlyInterestRate , numberOfYears * 12);
        System.out.print("Accumulated value is \u0024" + Math.round(accumulatedValue * 100) / 100.0);
    }
}
