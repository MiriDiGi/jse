package com.example.jse.m06.s15.ex2;

public class Consultant extends Worker{       //nell'altro modo questa è estensione di person

	private int fee;
	
	public Consultant(String firstName, String lastName, int fee) {
		super(firstName, lastName);
		this.fee = fee;
	}

	public int getFee() {
		return fee;
	}

	@Override
	public String toString() {
		return "Consultant [" + getFirstName() + " " + getLastName() + ", fee= " + fee + "]";
	}
	

	@Override
	public int monthly() {
		return fee * WORKING_DAYS;
	}
}
