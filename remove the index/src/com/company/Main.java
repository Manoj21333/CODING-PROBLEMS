package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("original array "+ Arrays.toString(arr));
        System.out.println("enter the index of number you want to remove");
        int index=sc.nextInt();
        for (int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("new array is "+Arrays.toString(arr));
    }
}
