package com.example.jse.mex.s04;

public class Exercise2 {
    /**
     * Add up only the even numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last  the right limit
     * @return the sum of all the even numbers, or zero
     */
    public static long evenSum(int first, int last) {
        long result = 0;
        for (int i = first; i <= last; i++) {
        	if (i % 2 == 0) {
        		result += i; 
        	}
        }
        return result;
    }
}
