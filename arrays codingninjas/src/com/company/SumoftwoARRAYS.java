package com.company;

import java.util.Scanner;

public class SumoftwoARRAYS {
    public static void sum(int arr1[],int arr2[] ,int arr[]) {
        int i= arr1.length-1;
        int j=arr2.length-1;
        int k= arr.length;
        int carry=0;
        while(i>=0&&j>=0){
            int num=arr1[i]+arr2[j]+carry;
            carry=num/10;
            arr[k]=num%10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int num=arr1[i]+arr2[j]+carry;
            carry=num/10;
            arr[k]=num%10;
            i--;
            k--;
        }
        while (j>=0){
            int num=arr1[i]+arr2[j]+carry;
            carry=num/10;
            arr[k]=num%10;
            j--;
            k--;
        }
    }

    public static void print( int m[] ) {
        for (int i=0;i<m.length;i++){
            System.out.print(m[i]);
        }
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int A1[]=new int [n];
        int A2 []=new int[m];
        for (int i=0;i<n;i++){
            A1[i]=sc.nextInt();
        }
        for (int i=0;i<m;i++){
            A2[i]= sc.nextInt();
        }
        int k=Math.max(A1.length,A2.length);
        int []arr=new int[k];
        sum(A1,A2,arr);
        print(arr);
    }
}
