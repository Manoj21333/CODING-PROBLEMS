package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        Scanner m=new Scanner(System.in);
        System.out.println("input the two numbers");
        a=m.nextInt();
        b=m.nextInt();
        System.out.println("sum of two integer is :"+a+b);
        System.out.println("difference of two integers :"+(a-b));
        System.out.println("product of two integers :"+a*b);
        System.out.println("average of two integers :"+(a+b)/2);
        if(a>b)
            System.out.println("a is largest no"+a);
        else
            System.out.println("b is largest "+b);
    }
}
