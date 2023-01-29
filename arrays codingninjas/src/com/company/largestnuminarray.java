package com.company;

import java.util.Scanner;

public class largestnuminarray {
    public static int  [] takeinput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter element at  "+i+" index");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int largestelement(int arr[]){
        int max= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

    public static void main(String[] args){
        int arr[]=takeinput();
        int lar = largestelement(arr);
        System.out.println("the largest element in the array is "+lar);
    }
}
