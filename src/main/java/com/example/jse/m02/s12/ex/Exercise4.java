package com.example.jse.m02.s12.ex;

public class Exercise4 {
    public static void main(String[] args) {
        /*
         * TODO: print up to 3 args
         * 
         * ["ciao", "hello"] -> "ciao" "hello"
         * 
         * ["ciao", "hello", "ciao", "hello"] -> "ciao" "hello", "ciao"
         */
    	System.out.println("passami gli argomenti: ");
    	System.out.println();
    	
    	int end;
    	if (args.length > 3) {
    		end = 3;              
        }                           //posso usare operatore ternario 
    	else {	                    //int end = (args.length > 3)? 3 : args.length;
    	 end = args.length;         //ho creato una variabile che mi dice che se è più lungo di 3 ci fermiamo a 3 altrimenti stampiamo la lunghezza
    	}	
    	
    	
    	for (int i = 0; i < end; ++i) {     //non posso dire < 4 perchè se sono davvero meno esplode il programma
     		System.out.println(args[i]); 
     	
    	}
    }
}
