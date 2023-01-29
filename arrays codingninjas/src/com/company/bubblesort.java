package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {

    public static void bubblesorting(int []arr) {
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int arr []= new int[n];
        System.out.println("enter the elements of the arrays");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        bubblesorting(arr);
        System.out.println("the sorted array is ");
        System.out.println(Arrays.toString(arr));

    }
}
