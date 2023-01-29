package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       int max=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
        for (int j=0;j<n-2;j++){
            max=math.max(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[])
        }
        }
    }