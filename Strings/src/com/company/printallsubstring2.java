package com.company;

import java.util.Scanner;

public class printallsubstring2 {
    public static void printstring(String str) {
        for (int len=1;len<=str.length();len++){
            for (int start=0;start<=str.length()-len;start++){
                int end =start+len-1;
                System.out.println(str.substring(start,end+1));
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        printstring(str);

    }
}
