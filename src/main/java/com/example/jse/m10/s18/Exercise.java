package com.example.jse.m10.s18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise {
    /**
     * Generate an array that contains only once each value (possibly duplicated) in the input array
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 35, 53 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data an array with duplicates
     * @return the original array (but wrapped values) stripped of duplicates
     */
    public Integer[] singles(int[] data) {
        // TODO
     //  throw new UnsupportedOperationException("Not yet implemented");
    	Set<Integer> result = new HashSet<Integer>();
    	
    	for (int value: data) {     //prendo tutti i valori, l'hashset non accetta duplicati e torna tutto giusto
    		result.add(value);
    	}
    	return result.toArray(new Integer[result.size()]);   //converto una collezione qualunque in un array sel suo tipo base
    }
    
    public Integer[] singlesList(int[] data) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	for (int value: data) {
    		if (!result.contains(value)) {
    		result.add(value);
    		}
    	}
    	return result.toArray(new Integer[result.size()]);
    }
    
    public Integer[] singlesSorted(int[] data) {
    	TreeSet<Integer> result = new TreeSet<Integer>();    //posso abbreviare Set<Integer> result  = bla blautilizzo l'albero, li ritorna ordinati
    	
    	for (int value: data) {
    		result.add(value);
    		
    	}
    	return result.toArray(new Integer[result.size()]);
    }
}
