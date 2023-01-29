package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input one num ");
        int a=sc.nextInt();
        System.out.println("input the second num");
        int b=sc.nextInt();
        int c = (a*b);
        System.out.println("multiplication of two no is "+" "+ c);

    }
}
