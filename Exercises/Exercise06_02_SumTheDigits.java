package chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_02_SumTheDigits {
    /*
    Write a method that computes the sum of the digits
    in an integer. Use the following method header
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The sum of digits of integer is: " + sumDigits(number));
    }

    public static int sumDigits(long number) {
        long digit;
        long sum = 0;
        while (number > 1) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return (int) sum;
    }
}
