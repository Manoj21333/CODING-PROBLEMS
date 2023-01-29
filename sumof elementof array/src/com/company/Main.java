package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        int sum=0;
        System.out.println("enter the size of array");
        int N=sc.nextInt();
        int ar1[]=new int[N];
        System.out.println("enter the elements of array");
        for (int i=0;i<N;i++){
            ar1[i]=sc.nextInt();
        }
        for (int i=0;i<N;i++){
            sum+=ar1[i];
        }
        System.out.println("the sum of the element of array "+sum);

    }
}
