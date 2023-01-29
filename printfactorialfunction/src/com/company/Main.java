package com.company;

import java.util.Scanner;

public class Main {
    public static void printFactorial(int n) {
        int fact = 1;
        if (n < 0) {
            System.out.println("invalid number");


        } else
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        System.out.println(fact);
return;
    }



    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printFactorial( n);
    }
}
