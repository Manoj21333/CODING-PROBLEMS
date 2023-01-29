package com.company;

import java.util.Scanner;

public class reversestring1 {
    public static String reverse(String str) {
        String strr="";
        for (int i=str.length()-1;i>=0;i--){
            strr+=str.charAt(i);
        }
return strr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       String st= reverse(str);
        System.out.println(st);
    }
}
