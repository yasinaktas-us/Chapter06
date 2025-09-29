package chapter06.Listings;

public class Listing06_03_ReturnGradeMethod {
    public static void main(String[] args) {

        System.out.println("1. grade is: "+ getGrade(77.5));

        System.out.println("2. grade is: "+ getGrade(90.1));

    }

    public static char getGrade(double score){
        if(score>=90.0){
            return 'A';
        }else if(score>=80.0){
            return 'B';
        }else if(score>=70.0){
            return 'C';
        }else if(score>=60.0){
            return 'D';
        }else
            return 'F';


    }
}
