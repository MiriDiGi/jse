package com.example.jse.mex.s05;

public class Exercise3 {
	
    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    public static String removeVowels(String s) {
        // TODO
    	char a = 'a';
    	char e = 'e';
    	char ii = 'i';
    	char o = 'o';
    	char u = 'u';
    	
    	StringBuilder consonanti = new StringBuilder();
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) != a && s.charAt(i)!= e && s.charAt(i)!= ii && s.charAt(i)!= o && s.charAt(i)!= u) {
    			consonanti.append(s.charAt(i));
    		
    		}
    	}
    	return consonanti.toString();
        // throw new UnsupportedOperationException("Not yet implemented");
    }
}
