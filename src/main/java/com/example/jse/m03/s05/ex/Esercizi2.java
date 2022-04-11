package com.example.jse.m03.s05.ex;

public class Esercizi2 {

	public static void main(String[] args) {
		
		String [] strings = {"buongiorno", "ciao", "bye"};
		String x = corta(strings);
		System.out.println(x);
		
		boolean result = teen(12, 18, 30);
		System.out.println(result);
	    
	}
	
	static String corta(String[] data) {
		String min = data[0];                         //metodo ordinare un array di stringhe in base alla loro lunghezza
		for (int i =1; i < data.length; i++) {
			if (data[i].length() < min.length()) {
			min = data [i];
			}
		}
		return min;
		}
	
	 static String change (String s) {
		s = "stringa";
		if (s == null || s.length() < 2) { 
			return s;
		}
		StringBuilder nuova = new StringBuilder(s);
		char temp = nuova.charAt(0);
		char last = nuova.charAt(nuova.length() -1);
		nuova.setCharAt(0, last);         //nuova.setCharAt(0, nuova.charAt(nuova.length()-1)); lo posso scrivere così
		nuova.setCharAt(last, temp);
		
	return nuova.toString();
	
	}
	 
	static boolean teen (int a, int b, int c) {
		 a = 10;
		 b = 30;
		 c = 18;
		if (a > 12 && a < 19) {
			return true;
		}
		if (b > 12 && b < 19) {
			return true;
		}
		if (c > 12 && c < 19) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
		

	

