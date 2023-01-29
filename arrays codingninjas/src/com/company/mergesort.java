package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
    public static int [] mergsort(int []a1,int []a2){
        int n= a1.length;
        int m= a2.length;
        int a3[]=new int [n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m) {
            if (a1[i] <= a2[j]) {
                a3[k] = a1[i];
                i++;
                k++;
            }
            else
            {
                a3[k] = a2[j];
                j++;
                k++;
            }
        }
            while(i<n){
                    a3[k] = a1[i];
                    i++;
                    k++;
                }
            while(j<m){
                    a3[k] = a2[j];
                    j++;
                    k++;
                }
                return a3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int  n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        int m= sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i]= sc.nextInt();
        }
        Arrays.sort(arr2);
      int temp []= mergsort(arr1,arr2);
       System.out.println(Arrays.toString(temp));
    }
}
