package com.example.jse.mex.s05;

public class Exercise1 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
        // TODO
      StringBuilder contrario = new StringBuilder();
      
      for (int i = s.length() - 1; i >= 0; i--) {
    	  contrario.append(s.charAt(i));
      }
    	return contrario.toString();
    	// throw new UnsupportedOperationException("Not yet implemented");
    }
}
