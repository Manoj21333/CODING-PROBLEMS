package com.company;

import java.util.Scanner;

public class Checkpermutation2 {
    public static void permutation(String a, String b) {
        if(a.length()!=b.length()){
            System.out.println("false");
            return;
        }
        int arr[]=new int[256];
   //     for (int i=0;i<256;i++){
     //       arr[i]=0;
        //}
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            arr[ch]++;
        }
        for (int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            arr[ch]--;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println("false");
                return;
            }

        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String atr = sc.nextLine();
permutation(str,atr);
    }
}
