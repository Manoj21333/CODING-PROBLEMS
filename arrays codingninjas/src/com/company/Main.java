package com.company;

import java.util.Scanner;

public class Main {
    public static int [] takeinput(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr []= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static  void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
	// write your code here
       int arr[]= takeinput();
        printarray(arr);
    }
}
