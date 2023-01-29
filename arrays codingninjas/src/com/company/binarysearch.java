package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    public static int search (int [] arr,int n,int t){
        int s=0,e=n-1;
        while(s<e) {
            int mid = (s + e) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr []= new int[n];
        System.out.println("enter the elements of the array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter the element for search");
        int t= sc.nextInt();
       int m= search(arr,n,t);
        System.out.println(m);
    }
}
