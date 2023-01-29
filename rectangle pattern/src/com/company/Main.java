package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=1;j<=n;j++)
        {
            System.out.print(" * ");
        }
            System.out.println();
        }
    }
}
