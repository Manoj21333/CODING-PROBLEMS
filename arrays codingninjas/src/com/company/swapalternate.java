package com.company;

import java.util.Scanner;

public class swapalternate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp=0;
        int n= sc.nextInt();
        int arr []=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        for (int i=0;i<n-1;i+=2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
