package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" 1");
                }
                else
                    System.out.print(" 0");
            }
            System.out.println();
        }
    }
}
