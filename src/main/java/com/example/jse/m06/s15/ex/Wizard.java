package com.example.jse.m06.s15.ex;

public class Wizard extends Actor {
	private int magic;
	
	public Wizard(String name, int magic) {        //mettiamo il costruttore e mettiamo anche un parametro magia
		super(name);
		this.magic = magic;
		
	}

	@Override
	public boolean fight(Actor enemy) {             //inseriamo il metodo fight
		if (enemy instanceof Wizard) {         //se l'avversario è un mago devo dire che vince chi ha un punteggio magic più alto
			Wizard other = (Wizard) enemy;     //dobbiamo fare un cast perchè actor non è magic
			return magic > other.magic;
		}
		return true;      //diciamo che vince sempre il mago                         
	}

}
