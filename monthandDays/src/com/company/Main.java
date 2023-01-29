package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {


            if(arr[i]%2==0&&arr[i]%3==0) {
                System.out.println(arr[i]);
            }
        }
    }
}
