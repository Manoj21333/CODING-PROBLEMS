package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int sum=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){

                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}
