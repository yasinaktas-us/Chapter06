package chapter06.Listings;

public class Listing06_05_TestPassByValue {
    public static void main(String[] args) {
        //declare variables
        int num1=5;
        int num2 =21;

        System.out.println("Before call the swap method, number1 is "+num1+" number2 is "+num2);

        // calling (invoking) swap method
        swap(num1,num2);

        // methods are not change the declared variables
        System.out.println("After call the swap method, number1 is "+num1+" number2 is "+num2);

    }
    //swap two numbers
    public static void swap(int number1, int number2){

        System.out.println("\tYou're in the swap method!!");
        System.out.println("\t\tBefore swapping, number1 is "+number1+" number2 is "+number2);

        int temp;
        temp=number1;
        number1=number2;
        number2=temp;

        System.out.println("\t\tAfter swapping, number1 is "+number1+" number2 is "+number2);
    }
}
