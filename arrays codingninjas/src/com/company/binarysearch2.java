package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class binarysearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the element to be found");
        int t = sc.nextInt();
        int index = Arrays.binarySearch(arr, t);
        if (index < 0) {
            System.out.println("no element is there");
        } else
            System.out.println("element is found at " + index+" index");
    }
}