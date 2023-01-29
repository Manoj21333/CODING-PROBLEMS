package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int y,d,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the minutes");
        min=sc.nextInt();
        d=min/(60*24);
        y=d/(365);
       d=d-(y*365);
        System.out.println(min+"  minutes are approaximately  "+y+" year and "+d+" days");


    }
}
