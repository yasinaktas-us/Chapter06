package chapter06.Listings;

import java.util.Scanner;

public class Listing06_12_PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        if(month<=0 && 13<month){
            System.out.println("Invalid month!!!");
            System.exit(0);
        }
        printMonth(year,month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year,month);

        printMonthBody(year,month);
    }

    public static void printMonthTitle(int year, int month) {
        String monthName="";
        switch (month){
            case 1:monthName="January";break;
            case 2:monthName="February";break;
            case 3:monthName="March";break;
            case 4:monthName="April";break;
            case 5:monthName="May";break;
            case 6:monthName="June";break;
            case 7:monthName="July";break;
            case 8:monthName="August";break;
            case 9:monthName="September";break;
            case 10:monthName="October";break;
            case 11:monthName="November";break;
            case 12:monthName="December";break;
        }
        System.out.println("\t\t"+monthName+" "+year);
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        //we need start day and number of day in 1 month
        int startDay = getStartDay(year, month);
        int numberOfDay = getNumberOfDaysInMonth(year, month);

        for (int i = 1; i < startDay; i++) {
            System.out.print("\t");
        }
        for (int j = 1; j <= numberOfDay ; j++) {
            System.out.printf(j+"\t");
            if ((j+startDay-1)%7==0)
                System.out.println();
        }
    }
    public static int getStartDay(int year, int month){
        //calendar start Wednesday, January 1, 1800
        final int START_DAY_FOR_1800 = 3;
        int startDay= getTotalNumberOfDays(year, month);
        int startMonthDay = (startDay + START_DAY_FOR_1800)%7;
        return startMonthDay;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int totalDays=0;
        for (int i = 1800; i<year;i++){
            if (isLeapYear(i))
                totalDays+=366;
            else
                totalDays+=365;
        }
        for (int i = 1; i < month; i++) {
            totalDays = totalDays + getNumberOfDaysInMonth(year, i);
        }
        return totalDays;
    }

    public static int getNumberOfDaysInMonth(int year, int month){
        int monthDays=0;
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            monthDays=31;
        if (month==4||month==6||month==9||month==11)
            monthDays=30;
        if (month==2) {
            if (isLeapYear(year))
                monthDays = 29;
            else
                monthDays=28;
        }
        return monthDays;
    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0 & year%100!=0 && year%400==0)
            return true;
        else
            return false;
    }
}
