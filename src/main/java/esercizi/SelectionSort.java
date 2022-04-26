package esercizi;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
//		int[] values = {12, 3, 5, 2, 6};
//		swap(values, 3, 0);
//    	System.out.println(Arrays.toString(values));
//    	

		int[] valori = { 5, 4, 7, 6, 2, 3 }; // metodo sorting
		int[] sort = veroSeroting(valori);
		System.out.println(Arrays.toString(sort));
		System.out.println();

	}
//	
//	public static void selectionSort(int[]array) {
//		int current = array[0];
//		for (int i = 0; i < array.length -1; i++) {
//			if (current < array[i]) {
//				current = i;
//			}
//		}
//	}
//	

	public static int[] veroSeroting(int[] valori) {
		int[] dati = valori;
		for (int i = 0; i < valori.length - 1; i++) {
			int min = i;
			for (int j = i; j < valori.length; j++) {
				if (valori[j] < valori[min]) {
					min = j;
				}
				int temp = valori[j];
				valori[j] = valori[min];
				valori[min] = temp;
			}

		}
		return dati;
	}
	

//	public static void swap (int[] array, int f, int j) {
//		int pos = array[f];
//		for (int i = 0; i < array.length; i++) {
//			if (i < j) {
//				array[i] = array[j];
//				array[j] = pos;
//			
//		}
//	}
//}
}