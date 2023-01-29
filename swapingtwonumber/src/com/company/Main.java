package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter one no");
        int a =sc.nextInt();
        System.out.println("enter second no");
        int b= sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value of a"+a);
        System.out.println("value of b"+b);

    }
}
