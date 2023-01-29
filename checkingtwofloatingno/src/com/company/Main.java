package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        n=sc.nextFloat();
        System.out.println("enter the second number");
        m=sc.nextFloat();
        if (n==m)
            System.out.println("both are equal");
        else
            System.out.println("they are different");
    }
}
