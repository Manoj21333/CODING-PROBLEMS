package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number :");

	int n= sc.nextInt();
    for (int i=0;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");//altenative write the code both of the side
        }
   for (int j=1;j<=2*i-1;j++){    // for(int j=1;j<=i;j++){
       System.out.print("*");  //    System.out.print("*"); }
   }
        System.out.println();   // for(int j=2;j<=i;j++){
    }                          //System.out.print("*");}
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
