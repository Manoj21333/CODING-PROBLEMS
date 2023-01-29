package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner bc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= bc.nextInt();
        int res=0;
        while(n!=0){
            int x=n%10;
            res=res*10+x;
            n=n/10;
        }
        System.out.println("Palindrome of this number is");
        System.out.println(res);
    }
}
