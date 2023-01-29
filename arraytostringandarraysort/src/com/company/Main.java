package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of numeric array");
        int N=sc.nextInt();

        int ar1[]=new int[N];
        System.out.println("enter the elements of numeric array");
        for (int i=0;i<N;i++){
            ar1[i]=sc.nextInt();
        }
        System.out.println("enter the size of string array");
        int M=sc.nextInt();
        String ar2[]=new String[M];
        System.out.println("enter the elements of string array");
        for(int i=0;i<M;i++){
            ar2[i]=sc.next();
        }
        System.out.println("the original  numeric array is "+ Arrays.toString(ar1));
        Arrays.sort(ar1);
        System.out.println("the new array is "+ Arrays.toString(ar1));
        System.out.println("the original String array is "+Arrays.toString(ar2));
        Arrays.sort(ar2);
        System.out.println("the new string array is "+Arrays.toString(ar2));
    }
}

