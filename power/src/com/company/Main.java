package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float a;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the input number");
        a=s.nextFloat();
        float sqr=a*a;
        float cube=a*a*a;
        float fouethpower=cube*a;
        System.out.println("square "+sqr);
        System.out.println("cube "+cube);
        System.out.println("fouth power is "+fouethpower);
    }
}
