package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three digit number");
        n=sc.nextInt();
        int n1=n/100%10;
        int n2= n/10%10;
        int n3=n%10;
        System.out.println(n1+" "+n2+" "+n3);

    }
}