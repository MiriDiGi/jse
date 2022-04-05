package com.example.jse.m02.s04;

public class Esempio {
	public static void main(String[] args) {
	String s = "Hello,";
	String t = s;
	System.out.println(t);
	s += " Miriam!";
	System.out.println(s);
	
	String q = "ciao,"; //la stringa è già immutabile, non serve il final
	String w = "hello!";
	
	w = q; //lo stesso id che c'è in q ora c'è in w
	
	System.out.println(w);
	System.out.println(q);
	
	//se mettiamo il final non possiamo dargli lo stesso reference (lo metto tra commenti così non mi da il bug)
	
	final String x = "ciao!";
//	String y = "hello!";
//	x = y;
	System.out.println(x);
	
	
	
	}
}
