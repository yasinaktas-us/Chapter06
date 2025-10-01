package chapter06.Exercises;

public class Exercise06_12_DisplayCharacters {
    public static void main(String[] args) {

        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for (int i = '1'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");
            count++;
            if (count % numberPerLine == 0)
                System.out.println();
        }
    }

}
