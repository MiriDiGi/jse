package com.example.jse.m05.s03.ex;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		System.out.println(Cat.getCount()); // chiamo il metodo get count per contare i gatti creati, è un metodo
											// statico, anche se non c'è un oggetto può essere invocato

		Cat cat = new Cat("Bob", "black"); // creo un gatto con il costruttore di gatti
		System.out.println(cat);

		System.out.println(Cat.getCount()); // riconto i gatti ora che ne ho creato uno

		String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
		String[] colors = { "blue", "green", "yellow", "black", "blue" };

		cat.meow();
		cat.meow("pappa!"); // il parametro inserito dall'utente

		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(colors));

		// TODO: (1) create an array of cats, same size of the arrays above

		Cat[] cats = new Cat[names.length]; // posso costruire un array che ha la stessa lunghezza di quelli sopra

		// Cat[] x = { } anche in questo modo scrivo un array di gatti con dimensione 0
		System.out.println(String.format("There are %d cats in the array", cats.length));

		// TODO: (2) initialize the cats array
		// each cat should have name and color from the arrays above

		for (int i = 0; i < cats.length; i++) { // abbiamo inizializzato i gatti nell'array
			cats[i] = new Cat(names[i], colors[i]);
		}

		System.out.println(String.format("Currently there are %d cats in the program", Cat.getCount()));

		// TODO: (3) each cat should meow

		for (int i = 0; i < cats.length; i++) {
			cats[i].meow();
		}
		// TODO: (4) each cat named Kit should meow

		for (int i = 0; i < cats.length; i++) {
			if (cats[i].getName().equals("Kit")) { // concateno diversi metodi
				cats[i].meow();
			}
		}

		// TODO: (5) only the first cat named Kit should meow

		for (int i = 0; i < cats.length; i++) {
			if (cats[i].getName().equals("Kit")) {
				cats[i].meow();
				break;
			}
		}
		System.out.println();

		// TODO: (6) only the cats in even position should meow

		for (int i = 0; i < cats.length; i++) {
			if (i % 2 == 0) {
				cats[i].meow();
			} else {                     //aggiunta mia, ho fatto miagolare anche i dispari 
				cats[i].meow("prrr");
			}
		}
	}
}
