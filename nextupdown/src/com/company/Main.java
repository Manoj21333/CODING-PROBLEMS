package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
 double d;
        float f;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the float value");
        f=sc.nextFloat();
        System.out.println("next value is "+ Math.nextUp(f));
        System.out.println("previous value is "+ Math.nextDown(f));
        System.out.println("enter the double value");
        d=sc.nextDouble();
        System.out.println("next double is "+Math.nextUp(d));
        System.out.println("previous double is "+Math.nextDown(d));

    }
}
