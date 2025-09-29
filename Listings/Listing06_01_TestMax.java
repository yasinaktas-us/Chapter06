package chapter06.Listings;

public class Listing06_01_TestMax {
    public static void main(String[] args) {
        int i = 4;
        int j = 9;
        int k = max(i, j);
        System.out.println("The maximum number is: " + k);
    }

    public static int max(int number1, int number2) {
        int max;
        if (number1 > number2) {
            //return number1;
            max = number1;
        } else
            //return number2;
            max = number2;

        return max;
    }
}
