package com.example.jse.mex.s05;

public class Exercise2 {
    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindrome(String s) {
        // TODO
    	if (s == null || s.length() < 2) {
    		return true;
    	}
                                                                             
    	for (int i = 0, j = s.length() - 1; i < s.length()/2; i++, j--) {       //posso scrivere i < j al posto di i < s.length()/2
    		if (s.charAt(i) != s.charAt(j)) {
    			return false;
    		}
    	} 
    	return true;
       // throw new UnsupportedOperationException("Not yet implemented");
    }
}
