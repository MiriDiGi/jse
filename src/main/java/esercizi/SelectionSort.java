package esercizi;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] values = {12, 3, 5, 2, 6};
		swap(values, 0, 0);
    	System.out.println(Arrays.toString(values));
	}
	
	public static void selectionSort(int[]array) {
		int current = array[0];
		for (int i = 0; i < array.length -1; i++) {
			if (current < array[i]) {
				current = i;
			}
		}
	}
	
	public static void swap (int[] array, int f, int j) {
		int pos = array[f];
		for (int i = 0; i < array.length; i++) {
			if (i < j) {
				array[i] = array[j];
				array[j] = pos;
			
		}
	}
}
}