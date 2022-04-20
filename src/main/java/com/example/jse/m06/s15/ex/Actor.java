package com.example.jse.m06.s15.ex;

public abstract class Actor {

	private String name;
	
	private int life;        //inseriamo i punti vita, mettendolo come proprietà e non come parametro è di default 10 per tutti

	protected Actor(String name) {
		this.name = name;
		this.life = 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract boolean fight(Actor enemy);

	public boolean isAlive() {         //ci serve un metodo per dirci se sono vivi o morti
		return life > 0;
	}
	
	public void kill() {          //creiamo un metodo per dire che cosa succede quando vengono uccisi
		life = 0;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", life=" + life + "]";
	}
	
}
