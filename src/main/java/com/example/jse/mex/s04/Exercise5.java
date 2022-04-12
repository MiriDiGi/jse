package com.example.jse.mex.s04;

public class Exercise5 {
    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
    	int result = 0;
    	value = Math.abs(value);  //non voglio che l'utente mi passi un valore negativo
    	
    	while (value != 0) {           //usiamo il while perchè non sappiamo quanto sia lungo il numero
    		int cipher = value % 10; //cipher è cifra
    		result += cipher;
    		value /= 10;      //dividere value per 10, è come scrivere value = value / 10;
    	}
    	
    	return result;
    }
}
 