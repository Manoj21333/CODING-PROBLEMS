package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("floor division using'/'operator "+(a/b));
        System.out.println("using floor division method "+ Math.floorDiv(a,b));
        System.out.println("floor modulus using % operator "+a%b);
        System.out.println("floor modulus using floor modulus method "+Math.floorMod(a,b));
    }
}
