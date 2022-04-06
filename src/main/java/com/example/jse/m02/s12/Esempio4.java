package com.example.jse.m02.s12;

public class Esempio4 {
	public static void main(String[] args) {
		System.out.println("passami degli argomenti");
		
		for (int i = 0; i < args.length; ++i) {
			System.out.print(i);
			
			if (i > 1 && i <5 ) {  //diciamo che se i è maggiore di uno E i minore di 5 skippa
				System.out.println("saltone");
				continue;
			}
			
			System.out.println(" " + args[i]);			 
		}
	
	}
}
