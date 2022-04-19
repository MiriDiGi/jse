package esercizi;

public class Esercizi {
	public static void main(String[] args) {
		int[] values = {1, 4, 6, 11, -15, -30, -2, 0};
		int[] result = countNumbers(values);
		System.out.println(result[0] + ", " + result[1]);
		
	
	}

		public static int[] countNumbers (int[]a) {        //conto valori si positivi che nefativi
			int[] result = {0,0};                       //per tenerne traccia tengo un'array
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= 0) {
					result [0] ++;
				}
				else {
					result [1] ++;
				}
			}
			return result;
		}
		
		public static void arrayReversed (int[] b) {                          //in-place, non crea nuovi array
			for (int i = 0, j = b.length - 1; i < j; i++, j--) {
				int temp = b[i];   //salviamo valore in una variabile temp
				b[i] = b[j];       //scambiamo valori
			    b[j] = temp;      //mettiamo il temp
			}
		}
		
		
		public static int[] nuovoArrayReverse(int[] a) {
			int[] result = new int[a.length];
			for (int i = 0, j = result.length - 1; i < a.length; i++, j--) {
				result[j] = a[i]; 
			}
			return result;
		}
	
}
