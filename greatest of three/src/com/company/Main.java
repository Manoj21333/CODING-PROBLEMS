package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no ");
        a=sc.nextInt();
        System.out.println("enter the second no ");
        b=sc.nextInt();
        System.out.println("enter the third no ");
        c=sc.nextInt();
        if(a>b&&a>c) {
            System.out.println("the greatest no is " + a);
        }
            else if (b>a&&b>c)
            System.out.println("the greatest no is  "+b);
            else
            System.out.println("greatest no is "+c);

    }
}
