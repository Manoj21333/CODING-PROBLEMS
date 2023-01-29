package com.company;

import java.nio.CharBuffer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int cap=7;
        CharBuffer  m=CharBuffer.allocate(cap);
        m.put('a');
        m.put(3,'b');
        m.put(4,'d');
        System.out.println(Arrays.toString(m.array()));

    }
}
