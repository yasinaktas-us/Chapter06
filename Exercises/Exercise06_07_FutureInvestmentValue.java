package chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_07_FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int INVESTMENT_YEARS=30;

        System.out.println("The amount investment : ");
        double investmentAmount = input.nextDouble();

        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInvestmentRate = annualInterestRate/1200;

        futureInvestmentValue(investmentAmount,monthlyInvestmentRate,INVESTMENT_YEARS);
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years){
        System.out.println("Years           Future Value");
        int year=1;
        double futureInvestmentValue=0;
        while (year<=years) {
            futureInvestmentValue = investmentAmount * (Math.pow((1 + (monthlyInterestRate)), year* 12));
            System.out.println(year+"         "+futureInvestmentValue);
            year++;
        }
        return futureInvestmentValue;
    }

}
