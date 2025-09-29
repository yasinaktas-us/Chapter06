package chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_06_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("the number of rows you want to see");
        int rows = input.nextInt();
        displayPattern(rows);
    }

    public static void displayPattern(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(" ");
            for (int j = 1; j <num-i; j++) {
                System.out.print(i + " ");
            }
            for (int n = i; n >0 ; n--) {
            }
            System.out.println();
        }

    }

}
