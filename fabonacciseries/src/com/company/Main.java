package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n1=0,n2=1,n3,c;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the term upto you want to print the series");
        c=sc.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=0;i<c;i++)
        {n3=n1+n2;
            System.out.print(" "+n3+" ");
          n1=n2;
          n2=n3;}
    }
}
