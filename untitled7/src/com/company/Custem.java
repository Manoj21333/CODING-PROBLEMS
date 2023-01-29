package com.company;

import java.util.Scanner;

    public class Custem{
        public static int divide( int a,int b) throws fact {
            if(b==0) {
                throw new fact();
            }
            return a/b;
        }
        public static void main(String[]args)  {
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            int j=sc.nextInt();
            try {
               int k= divide(i,j);
                System.out.println(k);
            } catch (fact e) {
                // TODO Auto-generated catch block
               e.printStackTrace();
                ;
            }
            System.out.println("hello");
        }
    }


