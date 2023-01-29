package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month,year;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of month");
        month =sc.nextInt();
        System.out.println("enter the year");
        year =sc.nextInt();
        String monthName=" " ;
        int days=0 ;
        switch(month) {
            case 1:
                monthName = "january";
                days = 31;
                break;
            case 2:
                monthName = "february";
                if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0)
                    days = 29;
                else
                    days = 28;
                break;
            case 3:
                monthName = "march";
                days = 31;
                break;
            case 4:
                monthName = "april";
                days = 30;
                break;
            case 5:
                monthName = "may";
                days = 31;
                break;
            case 6:
                monthName = "june";
                days = 30;
                break;
            case 7:
                monthName = "july";
                days = 31;
                break;
            case 8:
                monthName = "august";
                days = 31;
                break;
            case 9:
                monthName = "september";
                days = 30;
                break;
            case 10:
                monthName = "october";
                days = 31;
                break;
            case 11:
                monthName = "november";
                days = 30;
                break;
            case 12:
                monthName = "december";
                days = 31;
                break;
        }
            System.out.println(monthName + " " + year + "  has  " + days + "  days  ");
        }



}
