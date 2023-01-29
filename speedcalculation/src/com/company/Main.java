package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float met,hr,min,sec;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the distance");
        met=sc.nextFloat();
        System.out.println("enter the time in hour");
        hr=sc.nextFloat();
        System.out.println("enter the minutes");
        min=sc.nextFloat();
        System.out.println("enter the seconds");
        sec=sc.nextFloat();
        sec=(hr*3600+min*60+sec);
        float speed1 =met/sec;
        System.out.println("speed in meter per second "+ speed1);
       float speed2 =speed1*18/5;
        System.out.println("speed in kilometer per hour "+speed2);
    float speed3=(speed1*3600)/(1609*1000);
        System.out.println("speed in miles per hour "+speed3);


    }
}
