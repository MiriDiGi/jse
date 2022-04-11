package com.example.jse.m03.s05.ex;

public class Esercizi3 {

	public static void main(String[] args) {

		double[] array = { 2.3, 4.5, 9.2 };
		double data = sum(array);
		System.out.println(data);
	}

	static double sum(double[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		double somma = 0.0;
		for (int i = 0; i < array.length; i++) {
			somma = somma + array[i];
		}
		return somma;

	}
}
