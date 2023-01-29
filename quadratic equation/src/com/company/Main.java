package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        a = sc.nextInt();
        System.out.println("enter the value of b ");
        b = sc.nextInt();
        System.out.println("enter the value of c ");
        c = sc.nextInt();
        int d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.pow(d, 0.5)) / 2 * a;
            double x2 = (-b - Math.pow(d, 0.5)) / 2 * a;
            System.out.println("the roots are real and distinct " + x1 + "  " + x2);
        } else if (d == 0) {
            float x1 = -b / 2 * a;
            System.out.println("the roots are real and equal  " + x1);
        } else {

            System.out.println("roots are imaginary " );
        }
    }
}