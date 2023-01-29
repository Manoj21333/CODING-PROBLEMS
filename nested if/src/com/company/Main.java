package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int collageyear = sc.nextInt();
     //   String ch =sc.next();
        char ch='C';
        switch (collageyear) {
            case 1:
                System.out.println("math,english,science");
            case 2:
                switch (ch) {
                    case 'C':
                        System.out.println("communication engineering");
                        break;
                    case 'E':
                        System.out.println(" Electronic and communication");
                        break;
                    case 'M':
                        System.out.println(" Mechanical engineering");
                        break;

                }
            case 3:
                switch (ch) {
                    case 'C':
                        System.out.println("fluid mechanics");
                    case 'E':
                        System.out.println(" electronics");
                    case 'M':
                        System.out.println(" Mathematics");
                }
            case 4:
                switch (ch) {
                    case 'C':
                        System.out.println("chemical engineering");
                        break;
                    case 'E':
                        System.out.println(" mechanics");
                        break;
                    case 'M':
                        System.out.println("mechanics of materials");
                        break;
                }

        }
    }
}