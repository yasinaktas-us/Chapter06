package chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_03_PalindromeInteger {
    /*
    Write a test program that prompts the
    user to enter an integer and reports whether the integer is a palindrome.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.print("Number is Palindrome");
        else
            System.out.print("Number is not Palindrome");
    }

    public static boolean isPalindrome(int num) {
        if (num == reverse(num))
            return true;
        else
            return false;
    }

    public static int reverse(int num) {
        int count = 0;  //how many digits
        int digit;
        int controlNum = num;
        int reverseNum = 0;
        while (num >= 1) {
            num = num / 10;
            count++;
        }
        for (int i = count - 1; i >= 0; i--) {
            digit = controlNum % 10;
            reverseNum += digit * Math.pow(10, i);
            controlNum = controlNum / 10;
        }
        return reverseNum;
    }
}
