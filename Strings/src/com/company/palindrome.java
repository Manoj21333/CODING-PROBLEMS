package com.company;

import java.util.Scanner;

public class palindrome {
        public static void Palindrome(String str) {
            int j= str.length()-1;
            int i=0;
            while (i<j) {
                if (str.charAt(i) != str.charAt(j)) {
                    System.out.println(" No");
                }
                i++;
                j--;
            }
              System.out.println("true");

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            Palindrome(str);
        }
    }


