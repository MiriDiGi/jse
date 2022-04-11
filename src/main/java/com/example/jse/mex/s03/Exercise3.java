package com.example.jse.mex.s03;

public class Exercise3 {
	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
//    if (value == 0) {
//    	return "zero";    posso ripetere per tutti i numeri
//    }
		switch (value) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		default:
			return "other";
		}

	}
}
