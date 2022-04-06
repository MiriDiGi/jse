package com.example.jse.m02.s12;

public class Esempio2 {
	public static void main(String[] args) {
		System.out.println("passami degli argomenti");

		for (int i = 0; i < args.length; ++i) {
			System.out.print(i);

			if (i == 2) {
				System.out.println("primo salto");
				continue;
			} else if (i == 3) {            //non è il modo ottimale perchè molto lungo da scrivere, pieno di ripetizioni
				System.out.println("secondo salto");
				continue;
			} else if (i == 4) {
				System.out.println("terzo salto");
				continue;
			}

			System.out.println(" " + args[i]);
		}

	}
}
