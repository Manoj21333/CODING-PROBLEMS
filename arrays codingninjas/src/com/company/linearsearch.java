package com.company;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of testcase");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            takeinput();
        }
    }
    public static void takeinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            //System.out.println("enter element at  " + i + " index");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the no to search");
        int x = sc.nextInt();
        for (int i= 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println("element is found at "+i+"th index");
                return;
            }
           // else
             //   System.out.println("element is not there");
        }




    }
}
