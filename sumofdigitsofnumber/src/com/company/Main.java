package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0&&n<1000)
        {int num = n%10;
            System.out.println("first digit is"+num);
            r=n/10;
            int num2=r%10;
            System.out.println("second  digit is "+num2);
            r=r/10;
            int num3=r%10;
            System.out.println("third digit is "+num3);
            int sum =num+num2+num3;
            System.out.println("the sum of the digits is "+"  "+sum);
        }
        else
            System.out.println("input number is not valid");
    }
}
