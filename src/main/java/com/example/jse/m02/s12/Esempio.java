package com.example.jse.m02.s12;

public class Esempio {
	public static void main(String[] args) {
		System.out.println("passami degli argomenti");
		
		for (int i = 0; i < args.length; ++i) {
			System.out.print(i);
			
			if (i ==2 ) {
				System.out.println(); //metto questo altrimenti mi incolla 2 e 5, così mette il 2 e il 5 in colonna
				i = 4;           //in questo modo gli dico di saltare direttamente al 4
				continue;        //posso anche scrivere i += 2
			}
			
			System.out.println(" " + args[i]);			 
		}
	
	
	}
}
