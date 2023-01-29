package com.company;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class rotatearray {
    public static void rotatearrays(int arr[],int d){
        for(int i=0;i<d;i++){
        int temp=arr[0];
        for(int j=0;j<arr.length-1;j++){

            arr[j]=arr[j+1];

        }arr[arr.length-1]=temp;
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr []=new int [n];
        System.out.println("enter the elements of the arrays");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no by which array should be rotated");
        int d = sc.nextInt();
        rotatearrays(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
