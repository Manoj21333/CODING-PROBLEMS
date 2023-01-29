package com.company;

import java.util.Scanner;

public class reverseallwords {
    public static String Reverseword(String str) {
        String manoj="";
        int wordstart=0;
        int i=0;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                int wordend=i-1;
                String reverse="";
                for(int j=wordstart;j<=wordend;j++){
                    reverse=str.charAt(j)+reverse;
                }
                wordstart=i+1;
                manoj+=reverse+' ';
            }
        }
        int wordend=i-1;
        String reverse="";
        for(int j=wordstart;j<=wordend;j++){
            reverse=str.charAt(j)+reverse;
        }
        manoj+=reverse;
        return manoj;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Reverseword(str));
    }
}
