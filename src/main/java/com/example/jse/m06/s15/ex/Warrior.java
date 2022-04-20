package com.example.jse.m06.s15.ex;

public class Warrior extends Actor{
	private int strength;
	
	public Warrior(String name, int strength) {        //facciamo il costruttore con nome del warrior e la sua forza come parametri
		super(name);
		this.strength = strength;
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Warrior) {         //se l'avversario è un warrior devo dire che vince chi ha un punteggio strength più alto
			Warrior other = (Warrior) enemy;     //dobbiamo fare un cast perchè actor non è strength
			return strength > other.strength;
		}
		return false;                            
	}

}
