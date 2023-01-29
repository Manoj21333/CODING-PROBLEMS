package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the first number");
        int a= sc.nextInt();
        System.out.println("input the second number");
        int b =sc.nextInt();
    int m = (a/b);
        System.out.println("the division of the numbers is "+ m);
    }
}
