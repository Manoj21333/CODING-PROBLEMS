package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        System.out.println("input the GMT time");
       long gmt=sc.nextInt();
       long ms=System.currentTimeMillis();
       long ts=ms/1000;
       long currentsecond =ts%60;
       long tm=ts/60;
       long currentminute=tm%60;
       long th=tm/60;
       long currenthour = (th+gmt)%24;
        System.out.println("current time is "+currenthour+":"+currentminute+":"+currentsecond);


    }
}
