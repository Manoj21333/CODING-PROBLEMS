package com.company;

import java.util.Scanner;

public class reversestring2{
    public static String reverse(String str) {
        String strr="";
        for (int i=0;i<str.length();i++){
            strr=str.charAt(i)+strr;
        }
        return strr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       // String st= reverse(str);
        System.out.println(reverse(str));
    }
}
