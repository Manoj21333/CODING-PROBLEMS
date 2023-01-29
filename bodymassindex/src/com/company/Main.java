package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the body weight in pounds ");
        double weight = sc.nextDouble();
        System.out.println("enter the height in inches");
        double height =sc.nextDouble();
        double BMI =(weight*0.45)/(height*height*0.0254*0.0254);
        System.out.println("body mass index is "+BMI);
    }
}
