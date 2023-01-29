package com.company;

import java.util.Scanner;

public class arrayssum {
    public static int []takearray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
        public static int arraysum(){
        int arr []=takearray();
            int sum =0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
        }

    public static void main(String[] args) {
      //  int arr[]=takearray();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of testcase");
        int t= sc .nextInt();
        for (int i=0;i<t;i++){
            //System.out.println("enter the elements of the array");
          //  int arr[]=takearray();
            int sum = arraysum();
            System.out.println("sum of the elements of given arrray is  "+sum);

        }

    }
}
