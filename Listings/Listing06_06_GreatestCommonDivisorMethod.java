package chapter06.Listings;

import java.util.Scanner;

public class Listing06_06_GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        int first = input.nextInt();

        System.out.print("Enter 2nd integer: ");
        int second = input.nextInt();

        System.out.println("The greatest common divisor for " + first + " and " + second + " is: " + gcd(first, second));
    }

    public static int gcd(int number1, int number2) {
        int gdc=1;
        int div=2;      // first divisor

        //divisor should be between two numbers
        while(div<=number1 && div<= number2) {
            if (number1 % div == 0 && number2 % div == 0)
                //gdc updated
                gdc = div;
            div++;
        }
        return gdc;
    }
}
