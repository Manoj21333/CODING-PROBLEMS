package com.company;

import java.util.function.Supplier;

public class Java8 {


    private static ProcessHandle Stream;

    public static void main(String[] args) {


                Stream.of(0,1,2,3,4,5,6,7,8)

                        .skip(6)

                        .forEach(num->System.out.print("\n"+num));

            }


    }

