package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Checkpermutation {
    public static boolean isboolean(String str,String atr) {
        if (str.length()!=atr.length()){
         return false;
        }
        char array1[] = str.toCharArray();
        Arrays.sort(array1);
        char array2[] = atr.toCharArray();
        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
            System.out.println("true");
        }
       return true;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String atr= sc.nextLine();
        System.out.println( isboolean(str,atr));
    }
}
