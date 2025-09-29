package chapter06.Listings;

public class Listing06_02_TestVoidMethod {
    public static void main(String[] args) {

        System.out.println("1. exam grade");
        printGrade(79.9);

        System.out.println("2. exam grade:");
        printGrade(50.7);
    }
    public static void printGrade(double score){
        if(score>=90.0){
            System.out.println('A');
        }else if(score>=80.0){
            System.out.println('A');
        }else if(score>=70.0){
            System.out.println('A');
        }else if(score>=60.0){
            System.out.println('A');
        }else
            System.out.println('F');
    }
}
