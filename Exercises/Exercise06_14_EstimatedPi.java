package chapter06.Exercises;

public class Exercise06_14_EstimatedPi {
    public static void main(String[] args) {
        System.out.println("i\t\t\tm(i)");
        System.out.println("----------------------");
        double pi = getEstimatedPi();
    }
    public static double getEstimatedPi(){
        double pi =0;
        for (int i = 1; i < 1000; i++) {
            pi+=4*((Math.pow(-1,(i+1)))/(2*i-1));
            if(i%100==1)
            getPiTable(i,pi);
        }
        return pi;
    }
    public static void getPiTable(int i, double pi){
        System.out.print((i+"\t\t\t"));
        System.out.printf("%.4f",pi);
        System.out.println();

    }
}
