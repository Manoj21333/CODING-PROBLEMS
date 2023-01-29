package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++) {
            System.out.println(i);
            sum+=i;

        }
        System.out.println("sum of the natural number is");
        System.out.println(sum);
    }
}
