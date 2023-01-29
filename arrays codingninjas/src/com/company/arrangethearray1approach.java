package com.company;

import java.util.Scanner;

public class arrangethearray1approach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        int arr[] = new int[n];
        if (n % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = val;
                val = val + 2;
                System.out.print(arr[i]);
            }
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = n;
                n = n - 2;
                System.out.print(arr[i]);
            }
        } else {
            for (int i = 0; i <= arr.length / 2; i++) {
                arr[i] = val;
                val = val + 2;
                System.out.print(arr[i]);
            } int t=n-1;
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = t;
                t=t-2;
                System.out.print(arr[i]);
            }
        }
    }
}

