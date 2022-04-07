package com.example.jse.m03.s05.ex;

public class Esercizi {

	public static void main(String[] args) {
		int risultato = indexOf("hello", 'l');
		System.out.println(risultato);
		System.out.println();

		boolean result = contains("hello", 'l');
		System.out.println(result);
		System.out.println();
		
		String s = substring("hello my friend", 3, 8);
		System.out.println(s);
		
		
	}

	static int indexOf(String s, char c) {
		for (int i = 0; i < s.length(); i++) {     //metodo indexOf
			if (c == s.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	static boolean contains(String s, char t) {
		for (int i = 0; i < s.length(); i++) {     //metodo booleanContains
			if (s.charAt(i) == t) {
				return true;
			}
		}
		return false;

	}
	
	static String substring(String s, int begin, int end) {       //metodo substring
		StringBuilder nuova = new StringBuilder();
		for (int i = begin; i < end; i++) {
			nuova.append(s.charAt(i));
		}
		return nuova.toString();                                //converto lo stringbuilder in una stringa
	}
	
}
