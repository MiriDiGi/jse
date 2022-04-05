package com.example.jse.m02.s07;

public class Esempio {
	public static void main(String[] args) {
		String s;
		if (args.length == 0) {
		  s = "no arguments";
		}
		else {
			s = args [0];
		}
		System.out.println(s);
		
		String version1 = args.length == 0 ? "no args" : args [0];
		System.out.println(version1);
		
		if (args.length == 0) {
			s = "Wè, non hai inserito niente";
		}
		else {
			s = args [0];
		}
		System.out.println(s);
		
		if (args.length ==0) {
			System.out.println("ciao");
		}
		else {
			System.out.println("ciao" + args [0]); //se non metti [0] stampa tutto l'array
		}
	}
}
