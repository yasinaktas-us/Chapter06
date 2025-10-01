package chapter06.Exercises;

public class Exercise06_08_ConversionsDegrees {
    public static void main(String[] args) {

        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.print((40.0-i)+"\t\t"+celsiusToFahrenheit(40-i)+"\t\t\t|\t\t"+(120.0-10*i)+"\t\t"+fahrenheitToCelsius(120 - 10 * i));
            System.out.println();
        }
    }
    public static double celsiusToFahrenheit(double celsius) {

        double fahrenheit = (9.0 / 5) * celsius + 32;
        return (int)(fahrenheit*100)/100.0;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return (int)(celsius*100)/100.0;
    }
}
