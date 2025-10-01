package chapter06.Exercises;

public class Exercise06_13_SumSeries {
    public static void main(String[] args) {
        int number =20;

        System.out.println("i\t\t\tm(i)");
        System.out.println("----------------------");
        double sum = getSumSeries(number);

    }
    public static double getSumSeries(int number) {
        double sum = 0;
        for (double i = 1; i <= number; i++) {
            sum+=i/(i+1);
            getSeriesTable(i,sum);
        }
        return sum;
    }
    public static void getSeriesTable(double number, double sum){
        System.out.print((int) number+"\t\t\t");
        System.out.printf("%.4f",sum);
        System.out.println();
    }
}
