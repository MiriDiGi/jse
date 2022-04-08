package com.example.jse.m03.s05.ex;

public class Esercizi2 {

	public static void main(String[] args) {
		
		String [] strings = {"buongiorno", "ciao", "bye"};
		String x = corta(strings);
		System.out.println(x);
	
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
		
	}
	

