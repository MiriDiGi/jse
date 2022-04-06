package com.example.jse.m02.s12.ex;

import java.util.Arrays;

public class Exercise2 {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };
		System.out.println(Arrays.toString(flags));
		System.out.println();

		// TODO: swap the values in the given boolean array and then print it
		for (int i = 0; i < flags.length; ++i) {
			if (flags[i] == true) {
				System.out.println(false); // così stampo solo il contrario NON cambio l'array, io lo voglio cambiare
			} else {
				System.out.println(true);
			}
		}
		for (int i = 0; i < flags.length; ++i) {
			if (flags[i] == true) {
				flags[i] = false;
			} else {
				flags[i] = true;
			}
		}
		System.out.println(Arrays.toString(flags));

		for (int i = 0; i < flags.length; ++i) {
			flags[i] = !flags[i];                             //è corretto!!! lo trovi in exercise5
			
		}
		System.out.println(Arrays.toString(flags));
        
	}
}
