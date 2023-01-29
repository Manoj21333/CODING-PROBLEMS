package com.company;

import java.util.Scanner;

public class zeroonetwosort {
    public static void sort(int arr[]) {
        int nextzero = 0;
        int nexttwo = arr.length - 1;
        for (int i = 0; i <=nexttwo; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[nextzero];
                arr[nextzero] = temp;
                nextzero++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[nexttwo];
                arr[nexttwo] = temp;
                nexttwo--;
            }
        }
    }

    public static void print(int a[]) {
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n= t.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=t.nextInt();
        }
        sort(a);
        print(a);

    }
}
