package com.example.jse.m02.s12;

public class Esempio3 {
	public static void main(String[] args) {
		System.out.println("passami degli argomenti");
		
		for (int i = 0; i < args.length; ++i) {
			System.out.print(i);
			
			if (i ==2 || i == 3 || i == 4) {  //si utilizza l'OR basta che sia vera una e skippa
				System.out.println("saltone");
				continue;
			}
			
			System.out.println(" " + args[i]);			 
		}
	
	
	}
}
