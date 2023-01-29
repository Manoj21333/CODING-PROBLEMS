package com.company;

import java.util.Scanner;

public class Main {
    public static int printOddSum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        System.out.println("sum of the 0dd number is");
        printOddSum(n);

    }
}
