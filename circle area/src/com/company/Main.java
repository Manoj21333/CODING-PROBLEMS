package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        System.out.println(" input the radius of the circle ");
        float r = sc.nextFloat();
        System.out.println("area of the circle is "+3.14*r*r );
        System.out.println("perimeter of the circle is "+2*3.14*r);
    }
}
