package com.company;

import java.util.Scanner;

public class printallchar {
    public static void print(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));

        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        print(str);
    }
}
