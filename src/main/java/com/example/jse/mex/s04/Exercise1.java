package com.example.jse.mex.s04;

public class Exercise1 {
    /**
     * Add up all the numbers in the passed closed interval
     * 
     * @param first the leftmost value
     * @param last  the rightmost value
     * @return the sum of all the numbers, or zero
     */
    public static long sum(int first, int last) {
    	long result = 0;
    	for (int i = first; i <= last; i++) {
    		result += i;
    	}
    	return result;
    }
}
