package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class REMOVEthestring {
    public static String removeelements(String str) {
        String ch ="";
        int n =str.length();
        for (int i=0;i+1<n;i++){
            if(str.charAt(i)==str.charAt(i+1)){

            }
            else
             ch+=str.charAt(i);
        }
        ch+=str.charAt(n-1);
        return ch;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( removeelements(str));
    }
}
