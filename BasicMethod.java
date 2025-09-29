package chapter06;

import chapter06.Listings.Listing06_01_TestMax;

public class BasicMethod {
    public static void main(String[] args) {
        System.out.println("The sum of numbers from one to ten: " + sum(1, 10));

        int sum=sum(12, 40);
        System.out.println("The sum of numbers from one to ten: "+sum);
        System.out.println("The sum of numbers from one to ten: " + sum(20, 58));
        System.out.println();
        System.out.println("The multiplication of numbers from one to ten: " + multiplication(3, 12));

        System.out.println(Listing06_01_TestMax.max(16,18));

    }

    static int sum(int number1, int number2) {
        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        return sum;
    }

    static int multiplication(int numberA, int numberB) {

        int multi=numberA*numberB;

        return multi;

    }
}
