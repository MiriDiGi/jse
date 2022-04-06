package com.example.jse.m02.s12.ex;

import java.util.Arrays;

public class Exercise5 {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };
		System.out.println(Arrays.toString(flags));
		System.out.println();

		for (int i = 0; i < flags.length; ++i) {
			flags[i] = !flags[i];                             //da rivedere questo!!!
			
		}
		System.out.println(Arrays.toString(flags));
        
	}
}
