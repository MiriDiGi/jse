package com.example.jse.mex.s03;

public class Exercise1 {
    /**
     * Check if the parameter is positive, negative, or zero
     * 
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
     if (value > 0) {
    	 return "positive";
     }
     else if (value == 0) {
    	 return "zero";
     }
    	 return "negative";
     }
    }

