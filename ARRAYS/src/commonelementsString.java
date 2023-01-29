

import java.util.*;
import java.util.Scanner;
public class commonelementsString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int m=sc.nextInt();

        String arr1[]=new String[m];
        System.out.println("enter the elements of first array");
        for (int i=0;i< arr1.length;i++){
            arr1[i]=sc.next();
        }
        System.out.println("enter the size of second array");
        int n= sc.nextInt();
        String arr2[]=new String[n];
        System.out.println("enter the elements of second array");
        for (int i=0;i< arr2.length;i++){
            arr2[i]=sc.next();
        }
        for(int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                if (arr1[i].equals(arr2[j])){

                   //set.add(arr2[j]);
                    System.out.println("common elements are :"+arr2[j]);
                }
            }
        }

    }
}
