package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        int count =0;
        while(n!=0){
            n=n/10;
            count ++;
        }
        System.out.println("the digits of the given number is");
        System.out.println(count);
    }
}
