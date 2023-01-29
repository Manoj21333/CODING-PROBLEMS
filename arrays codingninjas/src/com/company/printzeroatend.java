package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class printzeroatend {
    public static void zeroatend(int []arr) {
        int i=0,k=0;
            while(i< arr.length){
                if (arr[i]!= 0) {
                    int temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                    k++;
                }
                i++;
            }
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements of the array");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
         zeroatend(arr);
        System.out.println(Arrays.toString(arr));
    }
}
