package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static int [] takearray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void selectionsortting(int temp[]){
        int n= temp.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int index =-1;
            for(int j=i;j<n;j++) {
                if (min >temp[j]) {
                    min = temp[j];
                    index = j;
                }
            }
                int tem=temp[i];
                temp[i]=temp[index];
                temp[index]=tem;

            }
        }


    public static void main(String[] args) {
        int [] arr=takearray();
       selectionsortting(arr);
        System.out.println("THE SORTED ARRAY IS "+Arrays.toString(arr));

    }
}
