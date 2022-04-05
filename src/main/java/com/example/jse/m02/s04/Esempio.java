package com.example.jse.m02.s04;

public class Esempio {
	public static void main(String[] args) {
	String s = "Hello,";
	String t = s;
	System.out.println(t);
	s += " Miriam!";
	System.out.println(s);
	
	final String q = "ciao,";
	String w = q;
	w += (" Miriam!");
	System.out.println(w);
	System.out.println(q);
	}
}
