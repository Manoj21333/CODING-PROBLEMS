package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System .in);
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("1");
        }else if(ch>='a'&&ch<='b'){
            System.out.println("0");
        }else
            System.out.println("-1");
    }
}
