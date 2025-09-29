package chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_05_SortThreeNumbers {
    /*
    Write a method with the following header to display three
    numbers in increasing order
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second integer: ");
        double number2 = input.nextDouble();
        System.out.print("Enter third integer: ");
        double number3 = input.nextDouble();

        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {


        if (num1 > num2 && num1 > num3) {
            if (num2>num3)
                System.out.print("The increasing ranking: "+num3+" >>> "+num2+" >>> "+num1);
            else
                System.out.print("The increasing ranking: "+num2+" >>> "+num3+" >>> "+num1);
        }
        if (num2 > num1 && num2 > num3) {
            if (num1>num3)
                System.out.print("The increasing ranking: "+num3+" >>> "+num1+" >>> "+num2);
            else
                System.out.print("The increasing ranking: "+num1+" >>> "+num3+" >>> "+num2);
        }
        if (num3 > num1 && num3 > num2) {
            if (num1>num2)
                System.out.print("The increasing ranking: "+num2+" >>> "+num1+" >>> "+num3);
            else
                System.out.print("The increasing ranking: "+num1+" >>> "+num2+" >>> "+num3);
        }


    }
}
