package chapter06.Exercises;

public class Exercise06_11_ComputeCommissions {
    public static void main(String[] args) {

        System.out.println("Sales Amount\t\tCommission");
        System.out.println("--------------------------------------");
        computeCommission(10000);


    }
    public static double computeCommission(double salesAmount){
        int count=0;
        double commissionAmount=0;
        while (count<20){
            commissionAmount=((5000)*0.08)+((5000)*0.10)+(salesAmount-10000)*0.12;
            getCommissionTable(salesAmount,commissionAmount);
            salesAmount+=5000;
            count++;
        }
        return commissionAmount;
    }
    public static void getCommissionTable(double salesAmount, double commissionAmount){
        System.out.println((int)salesAmount+"\t\t\t\t"+commissionAmount);
    }
}
