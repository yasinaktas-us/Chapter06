package chapter06.Listings;

public class Listing06_07_PrimeNumberMethod {
    public static void main(String[] args) {

        System.out.println("The first 50 prime numbers are: \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberPrimes) {
        final int NUMBERS_PER_LINE = 10;      //for line control

        int count = 0; //for range control
        int number = 2;  //smallest prime number;

        while (count <= numberPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % 10 == 0) {   //line control
                    System.out.printf("%5d", number);
                    System.out.println();
                }
                System.out.printf("%5d", number);
            }
            number ++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
