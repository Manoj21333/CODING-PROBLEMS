package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer");
        a=sc.nextInt();
        if(a>0)
            System.out.println("integer is positive "+a);
        else
            System.out.println("negetive");



    }
}
