package com.example.jse.m10.s15;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {
	
	public static void main(String[] args) {            //simulazione che vuole fare qualcuno quando invoca il mio metodo, lo abbiamo usato al posto di j unit
		Exercise e = new Exercise ();              //creiamo un oggetto non essendo metodo statico
		int[] input = { 1, 4, 6, 9, 2};               //posso non scrivere questo
		int[] data = e.evensRaw2(input);                //posso scrivere int[] data = e.evensRaw(new int [] {1, 4, 6, 9, 2});
		System.out.println(Arrays.toString(data));
		
		                          
		List<Integer> array = e.evens(input);           //metodo evens con ArrayList
		System.out.println(array);
		
		List<Integer> array2 = e.singles(new int [] {2, 4, 3, 4, 5, 6, 5, 7} );
		System.out.println(array2);
	}
    /**
     * Extract from input the even values and return them in an array
     * 
     * Do not use Collections in here!
     * 
     * @param data a bunch of integers
     * @return even values from input
     * 
     *         example: in {2, 3, 4, 5} -> out {2, 4}
     * 
     *         example: in {2, 2, 4, 6} -> out {2, 2, 4, 6}
     * 
     *         example: in {2, 3, 4, 6} -> out {2, 4, 6}
     */
    public int[] evensRaw(int[] data) {                  //questo è un metodo d'istanza
//    throw new UnsupportedOperationException("Not yet implemented");

       int [] result = new int [data.length];
       int j = 0;
		for (int i = 0; i < data.length; i++) {
        	if (data[i] % 2 == 0) {
        	result [j] = data [i];
        	j++;
        	}
		} 
		return Arrays.copyOf(result, j);            //ritorna una copia di result lunga quanto j
    }

    public int evenCount(int[] data) {
    	
    	int count = 0;
    	for (int i = 0; i < data.length; i++) {
        	if (data[i] % 2 == 0) {
        		count ++;
        	}
    	} 
    	return count;
    }
    
    
    public int[] evensRaw2(int[] data) {      //alternativa fatta con due loop
    	
    	int len = evenCount(data);     //se uso il metodo sopra
    	
 //     int len = 0;  	                             //se lo scrivo dentro lo stesso metodo
 //   	for (int i = 0; i < data.length; i++) {
 //       	if (data[i] % 2 == 0) {
 //       		len ++;
 //       	}
 //   	}
    	
    	int [] result = new int [len];
    	int j = 0;
    	for (int i = 0; i < data.length; i++) {
        	if (data[i] % 2 == 0) {
        		result [j] = data [i];
            	j++;
        	}       	
    	} 
    	return result;
    }
    
    
    /**
     * Extract from input the even values and return them in a List
     * 
     * @param data a bunch of integers
     * @return even values from input
     * 
     *         example: in {2, 3, 4, 5} -> out {2, 4}
     */
    public List<Integer> evens(int[] data) {
//       throw new UnsupportedOperationException("Not yet implemented");
    	
    	List<Integer> result = new ArrayList<Integer>();               //posso anche scrivere ArrayList<Integer> result = new ArrayList<Integer>();

  		for (int i = 0; i < data.length; i++) {       // for (int cur : data) {         con il for each
          	if (data[i] % 2 == 0) {                   //     if (cur % 2 == 0 ) {
          		result.add(data[i]);                  //     result.add(cur);
          	}
  		} 
  		return result; 
    }

    /**
     * Extract non-duplicated values in input and return them in a list
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     * 
     *         example: in {2, 3, 4, 4, 5, 5, 6, 7} -> out {2, 3, 6, 7}
     */
    public List<Integer> singles(int[] data) {
//       throw new UnsupportedOperationException("Not yet implemented");
    	
    	List<Integer> result = new ArrayList<Integer>();
    	Arrays.sort(data);
    	
/*    	for (int i = 0; i < data.length-1; i++) {
    		if (data[i] != data[i+1]) {
    			result.add(data[i]);
    		} else {
    			int j = i;
    			for (; j < data.length-1; j++) {
    				if (data[i] != data[j]) {
    					break;
    				}
    			} 
    			i = j;
    		}
  	}
  */
		return result;
    } 
}
