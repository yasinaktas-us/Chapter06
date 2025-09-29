package chapter06.Listings;

public class Listing06_04_Increment {
    public static void main(String[] args) {
        int a = 7;

        System.out.println("Before the increment() : " + a);

        increment(a);

        // no change, because a declared to "7"
        System.out.println("After the increment() : " + a);
    }

    private static void increment(int number) {
        number++;
        System.out.println("number inside the method is : " + number);
    }

}
