package com.example.jse.m02.s12.ex;

public class Exercise1 {
    public static void main(String[] args) {
        // TODO: print all values in [0 .. 9]  (compreso [0 .. 9] nove escluso [0 .. 9))
        // (1) for loop
    	System.out.println("passami i numeri:");
    	for (int i = 0; i < 10; ++i) {
    		System.out.println (args[i]);
    	}
    	System.out.println();
    	// oppure
    	
    	final int BEGIN = 0;
    	final int END =10;
    	System.out.println("print all numbers from " + BEGIN + " to " + END);
    	for (int i = BEGIN; i < END; ++i) {
    		System.out.println(i);
    	}
          	System.out.println();
    	// (2) while loop
  
    	int i = 0;
    	while (i < 10) {
    	System.out.println("stampo il numero " + args[i]);
    	++ i;
    	}
    	
    	System.out.println();
        // (3) do-while loop
    	
    	int p = 0;
     	do {
        System.out.println(args[p]);
        ++p;
    	}
    	while (p < 10);  	
    }
}
