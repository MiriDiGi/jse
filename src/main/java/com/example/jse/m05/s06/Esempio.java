package com.example.jse.m05.s06;

public class Esempio {
	public static void main (String[] args) {        
		if (args.length < 1) {
			System.out.println("passami qualcosa!");
		} else {
			char c = args [0].charAt(0);
			if (Character.isDigit(c)) {                  //voglio sapere se è un carattere o un numero questo è un metodo della classe wrapper
				System.out.println(c + " is a digit!");
			} else {
				System.out.println("try again!");
			}
		}
	}
}
