package com.company;

import java.util.Scanner;

public class Countwords {
    public static int countwords(String str) {
     int count=0;
     for (int i=0;i<str.length();i++) {
         if (str.charAt(i) ==' '){
             count++;
         }
     }
     return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String t=sc.nextLine();
       int m= countwords(t);
        System.out.println("the no of spaces in the line are : "+m);

    }
}