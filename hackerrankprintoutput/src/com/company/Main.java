package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        for(int i=1;i<=3;i++) {
            String str = sc.next();
            int a = sc.nextInt();
            System.out.println(str + "               " + a);
        }
        System.out.println("================================");
    }
}
