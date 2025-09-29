package chapter06.Listings;

public class Listing06_10_RandomCharacter {

    public static void main(String[] args) {

        System.out.println(getRandomCharacter());
        System.out.println(getRandomUppercase());
        System.out.println(getRandomLowercase());
        System.out.println(getRandomNumber());
    }

    //Between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        char randomChar = (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        return randomChar;
    }

    public static char getRandomUppercase() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomLowercase() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomNumber() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

}
