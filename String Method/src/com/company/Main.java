package com.company;

public class Main {

    public static void main(String[] args) {

	String s1= "manoj sharma";
        System.out.println("manoj length "+s1.length());
        System.out.println("charcater at second index "+s1.charAt(2));
        System.out.println("character from second index "+s1.substring(2));
        System.out.println(s1.substring(2,5));
        String s2="hello";
        String s3="world";
        System.out.println("cocaneted string "+s2.concat(s3));
        System.out.println("index of sharma is "+s1.indexOf("rma"));
        System.out.println(s1.indexOf("ar",2));
        System.out.println(s1.lastIndexOf("m"));
        boolean ok= "geeks".equals("geeks");
        System.out.println(ok);

        boolean good ="manoj".equals("sharma");
        System.out.println(good);

        boolean rank="MANOJ".equalsIgnoreCase("manoj");
        System.out.println(rank);
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareToIgnoreCase(s3));
        String s5=" RAJKUMAR ";
        System.out.println(s5.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s5.trim());
        System.out.println(s1.replace('m','n'));



    }
}
