package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int num, i;

        int num2[] = new int[100];
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num != 0) {
            num2[i++] = num % 2;
            num = num / 2;
        }
        for (int j = i; j > 1; j--) {
            System.out.println(num2[j]);

        }
        System.out.println("/n");
    }
}