package esercizi;

import java.util.Arrays;

public class Esercizi1 {

	public static void main(String[] args) {
		int risultato = indexOf("hello", 'l');           // metodo indexOf
		System.out.println(risultato);
		System.out.println();

		boolean result = contains("hello", 'l');         // metodo booleanContains
		System.out.println(result);
		System.out.println();

		String s = substring("hello my friend", 3, 8);    // metodo substring
		System.out.println(s);
		System.out.println();

		String t = substringb("abborracciatamente", 2, 11);      // altra prova substring esplicita
		System.out.println(t);
		System.out.println();
		
		int [] values = {5, 3};
		System.out.println(Arrays.toString(values));
		swap(values, 0, 1);                                   //metodo swap con primitivi
		System.out.println(Arrays.toString(values));
		System.out.println();
		
		int a = 6;
		int b = 2;
		System.out.println(a + "," + b);
		int temp = a;                        //swap classico
		a = b;
		b = temp;
		System.out.println(a + "," + b);
		System.out.println();
		
		int [] data = {5, 4, 7, 6, 2, 3};      //metodo indexMin
		int minpos = indexMin(data);
		System.out.println("il valore minimo è alla posizione " + minpos);
		System.out.println();
		
		int [] dati = {8, 4, 2, 9, 6};        //metodo maxValue
		int value = maxValue(dati);
		System.out.println("il valore massimo è " + value);
		System.out.println();
		
		
		String [] stringhe = {"hello", "ciao", "goodbye"};    //metodo stringa più corta
		String x = min(stringhe);
		System.out.println(x);
		System.out.println();
		
		
	}

// ----------------------------------------------------------------------------------------------------------
	
	
	static int indexOf(String s, char c) {
		for (int i = 0; i < s.length(); i++) {        // metodo indexOf
			if (c == s.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	static boolean contains(String s, char t) {
		for (int i = 0; i < s.length(); i++) {        // metodo booleanContains
			if (s.charAt(i) == t) {
				return true;
			}
		}
		return false;

	}

	static String substring(String s, int begin, int end) {     // metodo substring
		StringBuilder nuova = new StringBuilder();
		for (int i = begin; i < end; i++) {
			nuova.append(s.charAt(i));                          // usiamo append per aggiungere un carattere
		}
		return nuova.toString();                                // converto lo stringbuilder in una stringa
	}

	static String substringb(String s, int begin, int end) {
		StringBuilder nuovissima = new StringBuilder();
		for (int i = begin; i < end; i++) {
			char c = s.charAt(i);                              // altra prova substring uguale a sopra ma esplicita
			nuovissima.append(c);
		}
		return nuovissima.toString();
	}
	
	
	static void swap(int [] array, int i, int j) {
	    int temp = array [i];
	    array [i] = array [j];                        //metodo swap, non si può scrivere normalmente perchè gli int sono primitivi!!!
	    array [j] = temp;
	    return;
	}
	
	static int indexMin(int[] data) {
	    if (data == null || data.length == 0) {                        //ecco come si tira l'eccezione in caso di array vuoto o nullo
	    	throw new IllegalArgumentException("inuput errato");
	    }
		int pos = 0;
		for (int i = 1; i < data.length; ++i) {       //iniziamo da 1 perchè altrimenti i confronta pos ma pos è 0 e si confronterebbe con se stesso
			if (data[pos] > data[i]) {                //metto data[pos] maggiore di data[i] perchè facendo il minore tocca mettere un else
				pos = i;                              //non serve che metto return qui altrimenti non fa quello che chiedo
			}
		}
		return pos;
		
	}
	
//	static int maxValue(int [] dati) {            //trovo il valore massimo è sbagliato perchè DEVO LAVORARE SUI VALORI, altrimenti con il double non funziona
//		int value = 0;
//		for (int i = 1; i < dati.length; i++) {
//			if (dati[value] < dati[i]) {
//			value = i;	
//			}
//		}
//		return dati[value];
//	}
	
	
	   static int maxValue(int [] dati) {            //trovo il valore massimo giusto
	   int value = dati [0];
	   for (int i = 1; i < dati.length; i++) {
		     if (value < dati[i]) {
		     value = dati [i];	
	      	}
   	}
    	return value;
	   }
	   
	   static String min (String [] alfabeto) {
	   String valore = alfabeto [0];                       //metodo stringa più piccola
	   for (int i = 1; i < alfabeto.length; i++) {
		   if (alfabeto[i].compareTo(valore) < 0) {
			  valore = alfabeto[i];
		   }
	   }
	   return valore;
	   }   
	   
	   
}
