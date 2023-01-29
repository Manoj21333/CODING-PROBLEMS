package com.company;

import java.util.Scanner;
    import java.util.Scanner;
    public class Secondlargest {
        public static int seclargest(int arr[]) {
            int n= arr.length;
            int lar=Integer.MIN_VALUE;
            int seclar=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                if (lar<arr[i]){
                    seclar=lar;
                    lar=arr[i];
                }
                else if(seclar<arr[i]&&arr[i]!=lar){
                    seclar=arr[i];
                }
            }
               return seclar;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int [n];
    for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=seclargest(a);
            System.out.println(x);
    }
}
