package chapter06.Exercises;

public class Exercise06_09_ConversionsDistance {
    public static void main(String[] args) {

        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");
        System.out.println("-------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.print((i) + "\t\t" + footToMeter(i) + "\t\t\t|\t\t" + (19 + i) + "\t\t" + meterToFoot(19 + i));
            System.out.println();

        }
    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279*meter;
        return foot;
    }
}
