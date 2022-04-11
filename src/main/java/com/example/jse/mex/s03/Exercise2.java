package com.example.jse.mex.s03;

public class Exercise2 {
    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return true if odd
     */
    public static boolean isOdd(int value) {
    	if (value % 2 == 1) {
    		return true;
    	}
    	return false;
    }
    //possiamo scrivere anche return value % 2 == 1
}
