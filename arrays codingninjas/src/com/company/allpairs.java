package com.company;

import java.util.Scanner;

public class allpairs {
    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
return arr;
    }
    public static void printallpairs(int [] input){
        int n=  input.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                System.out.println("("+input[i]+","+input[j]+")");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr= takeinput();
        printallpairs(arr);

    }
}