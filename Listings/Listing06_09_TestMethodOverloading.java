package chapter06.Listings;

public class Listing06_09_TestMethodOverloading {
    public static void main(String[] args) {

        System.out.println("The maximum of 6 and 9 is " + max(6, 9));

        System.out.println("The maximum of 6 and 9 is " + max(6.0, 9.0));

        System.out.println("The maximum of 6, 9 and 13 is " + max(6.0, 9.0, 13.0));


    }

    public static int max(int num1, int num2) {
        int max = 0;
        if (num1 > num2)
            max = num1;
        else
            max = num2;
        return max;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, double num2, double num3) {
        return max(max(num1,num2),num3);  ///***
    }
}
