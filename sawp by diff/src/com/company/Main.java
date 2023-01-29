package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

                Scanner sc=new Scanner(System.in);
                int m,n;
        System.out.println(" input the value of m");
                m=sc.nextInt();
        System.out.println("input the value of n");

                n=sc.nextInt();

                m=m-n;
                n=m+n;
                m=n-m;
                System.out.println("value of  m"+m );
        System.out.println("value of n"+n);


            }
        }


