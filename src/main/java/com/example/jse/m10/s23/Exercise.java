package com.example.jse.m10.s23;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;


public class Exercise {
    /**
     * Extract non-duplicated values in input and return them in a list, for example:
     * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
     * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public List<Integer> singles(int[] data) {
 //       throw new UnsupportedOperationException("Not yet implemented");
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();   //voglio creare una mappa che ha come chiavi i miei valori e come value la numerosità degli elementi

//   for (int element: data) {   	                           al posto di fare quello sotto posso fare
//        Integer value = map.putIfAbsent(element, 1);         metti l'elemento corrente con il valore uno solo se è assente
//        if  (value != null) {                                 
//            map.put (element, value +1);                      se c'è torna il valore corrente
// 		 } 
//  }
    	
    	for (int element : data) {
    		if (map.containsKey(element)) {                             //se contiene l'elemento
    			Integer value = map.get(element) +1;               //prendi il valore associato e aggiungine 1
    			map.put(element, value);
    		} else {
    			map.put(element, 1);                  //se l'elemento non c'è mettici l'elemento e digli che è la prima volta che lo vedo
    		}
    	}
    	
    	System.out.println(map);
    	
    	List<Integer> result = new ArrayList<Integer>();
    	for (var entry : map.entrySet()) {    		//var fa dedurre il tipo al compilatore
    		if(entry.getValue() == 1) {             //looppo su tutte le coppie chiave valore se è uguale ad uno lo metto nella lista dei risultati
    			result.add(entry.getKey());
    		}
    	}
    	return result;
    }


    public static void main(String[] args) {
        List<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
        System.out.println(result);
    }
}
