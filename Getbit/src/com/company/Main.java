package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        System.out.println("enter the position of bit");
        int pos = sc.nextInt();
        int bitmark = 1 << pos;
        if ((bitmark & n) == 0) {
            System.out.println("bit was zero");
        }
    else{
            System.out.println("bit was one");

        }
    }
}
