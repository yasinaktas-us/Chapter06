package chapter06.Exercises;

public class Exercise06_01_PentagonalNumbers {
    /*
    A pentagonal number is defined as n(3n–1)/2 for
    n = 1,2,  . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
    Write a method with the following header that returns a pentagonal number:
     */
    public static void main(String[] args) {
        int number = 100;
        getPentagonalNumbers(number);

    }
    public static void getPentagonalNumbers(int number){
        int count=0;
        int pentagonal;
        for (int i=1; i<=number; i++){
            pentagonal=i*(3*i-1)/2;
            System.out.printf("%7d",pentagonal);
            count++;
            if(count%10==0)
                System.out.println();
        }
    }
}
