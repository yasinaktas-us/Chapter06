package chapter06.Listings;

import java.awt.*;
import java.util.Scanner;

public class Listing06_08_Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The hex number's decimal value is : " + hexToDecimal(hex));
    }

    public static int hexToDecimal(String hex) {
        int decimal = 0;
        for (int i = hex.length()-1; i >= 0; i--) {
            decimal += hexToChar(hex.charAt(i))*Math.pow(16,i);
        }
        return decimal;
    }

    public static int hexToChar(char ch) {
        if ('A' <= ch && ch <= 'F')
            return (ch - 'A') + 10;
        else
            return ch - '0';
    }
}
