package chapter06.Exercises;

public class Exercise06_10_PrimeNumbers {
    public static void main(String[] args) {

        getPrimeNumbers(10000);

    }
    public static void getPrimeNumbers(int number){
        int prime = 2;
        while (prime<number){
            if(isPrime(prime)) {
                System.out.println(prime);
            }

            prime++;
        }
    }
    public static boolean isPrime(int prime) {

        for (int i = 2; i < prime; i++) {
            if (prime % i == 0)
                return false;
        }
        return true;
    }

}
