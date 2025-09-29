package chapter06.Listings;

public class Listing06_11_TestRandomCharacter {
    public static void main(String[] args) {
        final int TOTAL_CHARS=200;
        final int CHARS_PER_LINE=20;

        for (int i = 1; i <= TOTAL_CHARS; i++) {
            char character = Listing06_10_RandomCharacter.getRandomUppercase();
            System.out.print(character);
            if(i%20==0){
                System.out.println();
            }
        }
    }
}
