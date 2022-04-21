package com.example.jse.m06.s15.ex2;

public abstract class Worker extends Person{      //creiamo la classe astratta worker per fare il metodo per farlo stampare a tutti

	public static final int WORKING_DAYS = 20;
	
	public Worker(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public abstract int monthly ();
	
	
}
