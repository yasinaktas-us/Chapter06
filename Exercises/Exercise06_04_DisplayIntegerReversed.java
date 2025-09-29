package chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_04_DisplayIntegerReversed {
    /*
     Write a method with the following header to display
     an integer in reverse order:
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        int count = 0;
        int reverseNumber = 0;
        int digit;
        int copyNumber=number;

        while (number>=1){
            number=number/10;
            count++;
        }
        for (int i = count-1;i>=0;i--){
            digit=copyNumber%10;
            reverseNumber+=digit*(Math.pow(10,i));
            copyNumber=copyNumber/10;
        }
        System.out.print(reverseNumber);
    }
}
