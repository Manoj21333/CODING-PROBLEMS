package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" first number");
        int a= sc.nextInt();
        System.out.println("second number");
        int b=sc.nextInt();
        System.out.print("sum is"+(a+b)"mutiplication is"+(a*b)+"division is "+(a/b)+" reminder is "+a%b);
    }
}
