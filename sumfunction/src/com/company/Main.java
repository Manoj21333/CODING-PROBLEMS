package com.company;

import java.util.Scanner;

public class Main {
    public static int sumInt(int m,int n){
        int j=m+n;
        return j;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
       int sum= sumInt(m,n);
        System.out.println(sum);
    }
}
