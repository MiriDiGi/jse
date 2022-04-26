package esercizi;

public class Esercizi {
	public static void main(String[] args) {
		int[] values = { 1, 4, 6, 11, -15, -30, -2, 0 };
		int[] result = countNumbers(values);
		System.out.println(result[0] + ", " + result[1]);
		System.out.println();

		String s = altPairs("pollo");
		System.out.println(s);
		System.out.println();
		
		boolean b = doubleX("axaxax");
		System.out.println(b);
		
		String p = frontTimes("ab", 4);
		System.out.println(p);

	}

	public static int[] countNumbers(int[] a) { // conto valori si positivi che nefativi
		int[] result = { 0, 0 }; // per tenerne traccia tengo un'array
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				result[0]++;
			} else {
				result[1]++;
			}
		}
		return result;
	}

	public static void arrayReversed(int[] b) { // in-place, non crea nuovi array
		for (int i = 0, j = b.length - 1; i < j; i++, j--) {
			int temp = b[i]; // salviamo valore in una variabile temp
			b[i] = b[j]; // scambiamo valori
			b[j] = temp; // mettiamo il temp
		}
	}

	public static int[] nuovoArrayReverse(int[] a) {
		int[] result = new int[a.length];
		for (int i = 0, j = result.length - 1; i < a.length; i++, j--) {
			result[j] = a[i];
		}
		return result;
	}

	public static String altPairs(String str) {

		StringBuilder sb = new StringBuilder();
		if (str.length() % 2 == 0) {
			for (int i = 0; i < str.length() - 1; i = i + 4) {
				sb.append(str.charAt(i));
				sb.append(str.charAt(i + 1));
			}
			return sb.toString();

		}
		if (str.length() == 3) {
			sb.append(str.charAt(0));
			sb.append(str.charAt(1)); // codice inutilmente lungo per prendi due, salti due
			return sb.toString();
		}

		if (str.length() % 2 == 1 && str.length() > 3) {
			for (int i = 0; i < str.length() - 1; i = i + 4) {
				sb.append(str.charAt(i));
				sb.append(str.charAt(i + 1));
			}
		}
		return sb.toString() + str.charAt(str.length() - 1);
	}
	
	
	static boolean doubleX(String str) {
		  int indice = -1;
		  for (int i = 0; i < str.length()-1; i++) {
		    if (str.charAt(i) == 'x') {
		      indice = str.indexOf('x');
		    }
		    if (str.charAt(indice +1) == 'x') {
		      return true;
		  }
		}return false;
		}

	public static String frontTimes(String str, int n) {
		  if (str.length() < 1) {
		    return str;
		  }
		  String s= str.substring(0, 3);
		  String result = "";
		  for (int i = 0; i < n; i++) {
		    result = result + s;
		  }
		  return result;
		} 

}
