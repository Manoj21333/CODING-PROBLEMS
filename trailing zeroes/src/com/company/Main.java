package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int res =0;
        System.out.println("enter the number");
        int n= sc.nextInt();
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        System.out.println("the trailing zeroes are "+res);
    }

}
