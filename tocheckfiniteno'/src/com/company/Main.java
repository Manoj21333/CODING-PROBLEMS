package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double d1 =0.5784758;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        d1=sc.nextDouble();
        boolean d2=Double.isFinite(d1);
        System.out.println("the given number is finite ? "+d2);
    }
}
